package com.ji.ready202309;

import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/10:11
 */
public class L33 {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(new L33().search(arr, 8));
    }

    public int search(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return -1;
        }

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int med = (j - i) / 2 + i;
            if (nums[med] == target) {
                return med;
            }

            if (nums[i] < nums[med]) {
                if (target >= nums[i] && target <= nums[med]) {
                    j = med - 1;
                } else {
                    i = med + 1;
                }
            } else {
                if (target <= nums[j] && target >= nums[med]) {
                    i = med + 1;
                } else {
                    j = med - 1;
                }
            }
        }

        return -1;
    }
}
