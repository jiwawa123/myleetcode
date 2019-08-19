package com.ji.algo.L351_400;/*
    user ji
    data 2019/8/19
    time 5:08 PM
*/

public class WiggleMaxLength {
    public static void main(String[] args) {
        int arr[] = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(wiggleMaxLength(arr));
    }

    public static int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length < 2)
            return nums.length;
        int len = 1;
        int arr[] = new int[nums.length];//增序列
        int arr1[] = new int[nums.length];//减序列
        arr[0] = 1;
        arr1[0] = 1;
        for (int i = 1; i <nums.length; i++) {
            arr[i] = 1;
            arr1[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > nums[i]) {
                    arr[i] = Math.max(arr[i], arr1[j] + 1);
                    len = Math.max(len, arr[i]);
                }
                if (nums[j] < nums[i]) {
                    arr1[i] = Math.max(arr1[i], arr[j] + 1);
                    len = Math.max(len, arr1[i]);
                }
            }
        }
        return len;
    }
}
