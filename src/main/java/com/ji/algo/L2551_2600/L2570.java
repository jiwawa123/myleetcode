package com.ji.algo.L2551_2600;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: Bei Chang
 * @Date: 2023/03/11/下午7:34
 */
public class L2570 {
    public static void main(String[] args) {

    }

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : nums1
        ) {
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }
        for (int[] arr : nums2
        ) {
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }

        HashMap<Integer, Integer> result0 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        int[][] res = new int[result0.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : result0.entrySet()
        ) {
            res[index][0] = entry.getKey();
            res[index][1] = entry.getValue();
            index++;
        }
        return res;

    }
}
