package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/9
    time 8:51 AM
*/

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,6)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int arr[] = {-1, -1};
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int med = start + (end - start) / 2;
            if (nums[med] == target) {
                if (med == 0) {
                    arr[0] = 0;
                    break;
                } else {
                    if (nums[med] > nums[med - 1]) {
                        arr[0] = med;
                        break;
                    } else {
                        end = med - 1;
                    }
                }
            } else if (nums[med] < target) {
                start = med + 1;
            } else {
                end = med - 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int med = start + (end - start) / 2;
            if (nums[med] == target) {
                if (med == nums.length-1) {
                    arr[1] = med;
                    break;
                } else {
                    if (nums[med] < nums[med + 1]) {
                        arr[1] = med;
                        break;
                    } else {
                        start = med + 1;
                    }
                }
            } else if (nums[med] < target) {
                start = med + 1;
            } else {
                end = med - 1;
            }
        }
        return arr;
    }
}
