package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/9
    time 9:05 AM
*/

public class SearchInsert {
    public static void main(String[] args) {
        int arr[] = {1,4,5,6};
        System.out.println(searchInsert(arr,2));

    }

    public static int searchInsert(int[] nums, int target) {
        if (null == nums || nums.length == 0)
            return 0;
        int start = 0, end = nums.length-1;
        while (start <= end) {
            int med = start + (end - start) / 2;
            if (nums[med] == target) {
                return med;
            } else if (nums[med] < target) {
                start = med + 1;
            } else {
                end = med - 1;
            }

        }
        return start;
    }
}
