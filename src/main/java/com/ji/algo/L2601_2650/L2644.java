package com.ji.algo.L2601_2650;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/01/22:06
 */
public class L2644 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 3, 9};
        int[] tmp = {5, 2, 3};
        System.out.println(maxDivScore(arr, tmp));
    }

    public static int maxDivScore(int[] nums, int[] divisors) {
        int res = Integer.MAX_VALUE, count = 0;
        for (int i = 0; i < divisors.length; i++) {
            int tmp = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0) {
                    tmp++;
                }
            }
            if (tmp > count) {
                res = divisors[i];
                count = tmp;
            } else if (tmp == count) {
                res = Math.min(res, divisors[i]);
            }
        }
        return res;
    }
}
