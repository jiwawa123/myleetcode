package com.ji.algo.L2351_2400;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/31/上午8:40
 */
public class L2389 {
    public static void main(String[] args) {

    }

    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (sum + nums[j] > queries[i]) {
                    res[i] = j;
                    break;
                }
                sum+=nums[j];
            }
        }
        return res;
    }
}
