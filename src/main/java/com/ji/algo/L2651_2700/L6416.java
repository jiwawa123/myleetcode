package com.ji.algo.L2651_2700;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/08/22:57
 */
public class L6416 {
    public static void main(String[] args) {
        int[] tmp = {3, 2, 3, 4, 2};
        distinctDifferenceArray(tmp);
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int[] res = new int[nums.length];
        Map<Integer, Integer> right = new HashMap<>();
        for (int t : nums
        ) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }
        Set<Integer> left = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            left.add(nums[i]);
            if (right.getOrDefault(nums[i], 0) > 1) {
                right.put(nums[i], right.get(nums[i]) - 1);
            } else {
                right.remove(nums[i]);
            }
            res[i] = left.size() - right.size();
        }
        return res;
    }
}
