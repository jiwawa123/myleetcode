package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/6
    time 8:57 PM
*/

public class BinarySearch {
    public static void main(String[] args) {

    }

    public int search(int nums[], int target) {
        if (null == nums || nums.length == 0)
            return 0;
        int i = 0, j = nums.length;
        while (i <= j) {
            int med = i + (j - i) / 2;
            if (nums[med] == target)
                return med;
            if (nums[med] < target) {
                i = med + 1;
            } else {
                j = med - 1;
            }
        }
        return -1;
    }
}
