package com.ji.algo.L2251_2300;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/06/07/上午8:39
 */
public class L2294 {
    public static void main(String[] args) {

    }

    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;
        int tmp = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (tmp == Integer.MAX_VALUE) {
                tmp = nums[i];
                res ++;
            } else {
                if (tmp + k < nums[i]) {
                    res ++;
                    tmp = nums[i];
                }
            }
        }
        return res;

    }

}
