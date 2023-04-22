package com.ji.algo.L2501_2550;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/02/20:33
 */
public class L2501 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 16, 8, 2};
        System.out.println(longestSquareStreak(arr));
    }

    public static int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i] * nums[i];
            if (i == 0) {
                map.put(tmp, 1);
            } else {
                if (map.containsKey(nums[i])) {
                    map.put(tmp, map.get(nums[i]) + 1);
                    len = Math.max(len, map.get(tmp));
                } else {
                    map.put(tmp, 1);
                }
            }
        }
        return len > 0 ? len : -1;
    }
}
