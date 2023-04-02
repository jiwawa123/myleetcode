package com.ji.algo.L2551_2600;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/02/18:09
 */
public class L2587 {
    public static void main(String[] args) {

    }

    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int len = 0;
        long sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            if (sum <= 0) {
                break;
            }
            len++;
        }
        return len;
    }
}
