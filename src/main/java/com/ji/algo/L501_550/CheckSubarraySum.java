package com.ji.algo.L501_550;/*
    user ji
    data 2019/8/19
    time 5:20 PM
*/

public class CheckSubarraySum {
    public static void main(String[] args) {
        int arr[] = {1,0};
        System.out.println(checkSubarraySum(arr,2));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        if (k == 0) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    count++;
                } else {
                    count = 0;
                }

                if (count >= 2)
                    return true;
            }
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] % k;
            for (int j = i + 1; j < nums.length; j++) {
                if ((sum + nums[j]) % k == 0)
                    return true;
                sum = (sum + nums[j]) % k;
            }
        }
        return false;
    }
}
