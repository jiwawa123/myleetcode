package com.ji.algo.offer;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/09/09:44
 */
public class L6913 {
    public static void main(String[] args) {

    }

    public int alternatingSubarray(int[] nums) {
        int res = -1;


        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            int len = 1;
            int f = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (flag && f + 1 == nums[j]) {
                    len++;
                    flag = false;
                    f = nums[i];
                } else if (!flag && f - 1 == nums[j]) {
                    len++;
                    flag = true;
                    f = nums[i];
                } else {
                    break;
                }
            }
            res = Math.max(res, len);
        }

        return res == 1 ? -1 : res;
    }
}
