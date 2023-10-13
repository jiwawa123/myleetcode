package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/08/08:44
 */
public class L153 {
    public static void main(String[] args) {

    }

    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high + low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
