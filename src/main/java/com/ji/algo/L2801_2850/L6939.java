package com.ji.algo.L2801_2850;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/13/12:14
 */
public class L6939 {
    public static void main(String[] args) {

    }

    public int maxSum(int[] nums) {
        int res = -1;
        int[] maxArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            while (n > 0) {
                maxArr[i] = Math.max(n % 10, maxArr[i]);
                n /= 10;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (maxArr[i] == maxArr[j]) {
                    res = Math.max(res, nums[i] + nums[j]);
                }
            }
        }

        return res;
    }
}
