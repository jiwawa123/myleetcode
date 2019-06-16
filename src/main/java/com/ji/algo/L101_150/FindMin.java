package com.ji.algo.L101_150;/*
    user ji
    data 2019/6/16
    time 8:11 PM
*/

public class FindMin {
    public static void main(String[] args) {

    }

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        if (nums[l] <= nums[r]) {
            return nums[l];
        }
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (nums[mid] > nums[0]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        throw new RuntimeException();
    }
}
