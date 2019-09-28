package com.ji.algo.L651_700;/*
    user ji
    data 2019/9/28
    time 10:54 AM
*/

public class L665 {
    public static void main(String[] args) {
        int arr[] = {4, 2, 3};
        System.out.println(checkPossibility(arr));
    }

    public static boolean checkPossibility(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 1; i < length && count < 2; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            }
            count++;
            if (count > 1)
                return false;
            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];     //使当前数字等于先前的数字
            } else {
                nums[i - 1] = nums[i];    //使前一个数字小于或等于当前数字
            }
        }
        return count <= 1;
    }
}
