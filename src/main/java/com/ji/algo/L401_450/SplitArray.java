package com.ji.algo.L401_450;/*
    user ji
    data 2019/8/22
    time 10:05 AM
*/

public class SplitArray {
    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 10, 8};
        System.out.println(splitArray(arr, 2));
    }

    public static int splitArray(int[] nums, int m) {
        int sum = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            l = Math.max(l, nums[i]);
        }

        int r = sum;
        while (l < r) {
            int med = (r - l) / 2 + l;
            int count = 1;
            int cur = 0;
            for (int i = 0; i < nums.length; i++) {
                if (cur + nums[i] <= med) {
                    cur += nums[i];
                } else {
                    count++;
                    cur = nums[i];
                }
            }
            if (count <= m) {
                r = med;
            } else {
                l = med + 1;
            }
        }
        return l;
    }
}
