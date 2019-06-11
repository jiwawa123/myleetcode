package com.ji.new_algo;/*
    user ji
    data 2019/6/8
    time 10:10 AM
*/

import java.util.Arrays;

public class ArrayAbout {

    public static void main(String[] args) {
        System.out.println(Math.floor(-0.5));
    }

    public int maxArea(int[] height) {
        if (height == null || height.length < 2)
            return 0;
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            if (height[i] < height[j]) {
                max = Math.max((j - i) * height[i], max);
                i++;
            } else {
                max = Math.max((j - i) * height[j], max);
                j--;
            }
        }
        return max;
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (tmp > k)
                continue;
            if (tmp == k) {
                count++;
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                tmp += nums[j];
                if (tmp > k)
                    break;
                if (tmp == k) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        Arrays.fill(arr, -1);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int med = i + (j - i) / 2;

        }
        return arr;

    }
}
