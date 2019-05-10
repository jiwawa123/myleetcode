package com.ji.algo.L551_600;/*
    user ji
    data 2019/5/10
    time 2:14 PM
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindUnsortedSubarray {
    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 8, 10, 9, 15};
        findUnsortedSubarray(arr);
    }

    public static int findUnsortedSubarray(int[] nums) {
        if (null == nums || nums.length < 2)
            return 0;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(nums);
        int start = -1, end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != arr[i]) {
                if (start == -1) {
                    start = i;
                } else {
                    end = i;
                }
            }

        }
        return start == end ? 0 : end - start + 1;
    }
}
