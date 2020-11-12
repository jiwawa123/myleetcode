package com.ji.algo.L1601_1650;

import java.util.*;
import java.util.stream.Collectors;

/**
 * user ji
 * data 2020/11/12
 * time 9:06 下午
 */
public class L1636 {
    public static void main(String[] args) {

    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res[] = new int[nums.length];
        for (int t : nums
        ) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>(
                map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() == o2.getValue())
                    return o1.getKey().compareTo(o2.getKey());
                return -(o1.getValue() - o2.getValue());
            }
        });
        int index = 0;
        for (int i = 0; i < entryList.size(); i++) {
            for (int j = 0; j < entryList.get(i).getValue(); j++) {
                res[index++] = entryList.get(i).getKey();
            }
        }

        return res;
    }
}
