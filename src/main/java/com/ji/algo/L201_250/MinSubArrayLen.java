package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/18
    time 9:15 PM
*/

public class MinSubArrayLen {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, arr));
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int len = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > s) {
                sum = 0;
                len = 0;
                continue;
            }
            if (nums[i] == s)
                return 1;
            if (sum + nums[i] < s) {
                sum += nums[i];
                len++;
            } else {
                sum += nums[i];
                while (sum >= s) {
                    sum -= nums[i - len];
                    if (sum < s)
                        break;
                    len--;
                }
                min = Math.min(len + 1, min);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
