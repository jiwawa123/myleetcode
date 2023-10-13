package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/04/18:19
 */
public class L35 {
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int med = (i + j) / 2;
            if (target == nums[med]) {
                return med;
            } else if (target > nums[med]) {
                i++;
            } else {
                j--;
            }
        }
        return -1;
    }
}
