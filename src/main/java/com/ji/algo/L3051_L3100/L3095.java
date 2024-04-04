package com.ji.algo.L3051_L3100;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/01/16:43
 */
public class L3095 {
    public static void main(String[] args) {
        int[] arr = {32, 1, 25, 11, 2};
        minimumSubarrayLength(arr, 59);
    }

    public static int minimumSubarrayLength(int[] nums, int k) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (tmp > k) {
                return 1;
            }
            for (int j = i + 1; j < nums.length; j++) {
                tmp ^= nums[j];
                System.out.println(tmp);
                if (tmp >= k) {
                    if (res == -1) {
                        res = (j - i + 1);
                    } else {
                        res = Math.min(res, j - i + 1);
                    }
                    break;
                }
            }
        }


        return res;
    }
}
