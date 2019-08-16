package com.ji.algo.L0_50;/*
    user ji
    data 2019/8/16
    time 5:11 PM
*/

public class Search {
    public static void main(String[] args) {
        int arr[] = {8, 9, 2, 3, 4};
        System.out.println(search(arr, 9));
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int med = (j - i) / 2 + i;
            if (nums[med] == target) {
                return med;
            }
            //中间数大于目标数字
            if (nums[med] > target) {
                if (nums[i] >= nums[med] && nums[j] >= nums[med]) {
                    j = med - 1;
                    continue;
                }
                if (nums[i] <= target) {
                    j = med - 1;
                    continue;
                }
                if (nums[i] > target) {
                    i = med + 1;
                }
            } else {//中间数小于目标数字
                if (nums[i] >= nums[med] && nums[j] >= nums[med]) {
                    if (nums[j] >= target) {
                        i = med + 1;
                        continue;
                    } else {
                        j = med - 1;
                    }
                }
                if (nums[i] < nums[med]) {
                    i = med + 1;
                    continue;
                } else {
                    j = med - 1;
                }
            }
        }
        return -1;
    }
}
