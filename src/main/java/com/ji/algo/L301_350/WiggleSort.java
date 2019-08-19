package com.ji.algo.L301_350;/*
    user ji
    data 2019/8/19
    time 4:36 PM
*/

import java.util.Arrays;

public class WiggleSort {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 2, 2, 1};
        wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void wiggleSort(int[] nums) {
        if (nums == null || nums.length < 2)
            return;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int med = (arr.length + 1) / 2 - 1;
        int i = 0;
        int j = nums.length - 1;
        while (i < arr.length) {
            nums[i] = arr[med--];
            if (++i >= arr.length)
                break;
            nums[i++] = arr[j--];
        }
    }
}
