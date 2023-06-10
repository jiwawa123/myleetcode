package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/10/17:40
 */
public class LO068 {
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int med = (start + end) / 2;
            if (nums[med] == target) {
                return med;
            } else if (nums[med] < target) {
                start++;
            } else {
                end-- ;
            }
        }
        return start;
    }
}
