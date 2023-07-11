package com.ji.algo.LCP;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/29/08:42
 */
public class Offer060 {

    public static void main(String[] args) {

    }


    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : nums
        ) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        List<Integer> list = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
        ) {
            list.add(entry.getValue());

        }
        Collections.sort(list);
        Set<Integer> set = new HashSet<>();
        for (int i = list.size() - 1; i >= list.size() - k; i--) {
            set.add(list.get(i));
        }
        int[] arr = new int[k];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
        ) {
            if (set.contains(entry.getValue())) {
                arr[index++] = entry.getKey();
            }
            if (index == k) {
                break;
            }
        }
        return arr;
    }
}

