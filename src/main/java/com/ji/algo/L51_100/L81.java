package com.ji.algo.L51_100;/*
    user ji
    data 2019/9/25
    time 10:48 PM
*/

public class L81 {
    public static void main(String[] args) {
        int tmp[] = {1, 3, 1, 1, 1};
        search(tmp, 3);
    }

    public static boolean search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int med = (j - i) / 2 + i;
            if (nums[med] == target) {
                return true;
            }
            if (nums[i] <= nums[med]) {
                if (nums[i] <= target && nums[med] >= target) {
                    j = med - 1;
                } else {
                    i = med + 1;
                }
            } else {
                if (nums[med] <= target && nums[j] >= target) {
                    j = med - 1;
                } else {
                    i = med + 1;
                }
            }
        }
        return false;
    }
}
