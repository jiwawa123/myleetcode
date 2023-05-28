package com.ji.algo.L2651_2700;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/20/09:45
 */
public class L2679 {
    public static void main(String[] args) {

    }

    public int matrixSum(int[][] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }
        for (int i = 0; i < nums[0].length; i++) {
            int max = 0;
            for (int j = 0; j < nums.length; j++) {
                max = Math.max(nums[j][i], max);
            }
            res += max;
        }
        return res;
    }
}
