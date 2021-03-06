package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/16
    time 5:01 PM
*/

public class CanJump {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,0,1,1};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length < 2) {
            return true;
        }
        if (nums[0] == 0)
            return false;
        int start = nums[0];
        for (int i = 1; i <= start && i < nums.length; i++) {
            start = Math.max(start, nums[i] + i);
            if (start >= nums.length - 1)
                return true;
            if(start==i&&nums[i]==0)
                return false;
        }
        return start >= nums.length - 1;
    }
}
