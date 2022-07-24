package com.ji.algo.L2301_2350;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/24/上午11:23
 */
public class L2341 {
    public static void main(String[] args) {

    }

    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums
        ) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0, res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
        ) {
            count += entry.getValue() / 2;
            res += entry.getValue() % 2;
        }

        int[] arr = {count, res};
        return arr;
    }
}
