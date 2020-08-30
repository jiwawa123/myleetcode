package com.ji.algo.G0830;

import java.util.Arrays;

/**
 * user ji
 * data 2020/8/30
 * time 10:29 上午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = {-7, -10, -7, 21, 20, -12, -34, 26, 2};
        System.out.println(getMaxLen(arr));
    }

    public static int getMaxLen(int[] nums) {
        if (nums.length == 0)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return Math.max(getMaxLen(Arrays.copyOfRange(nums, 0, i)),
                        getMaxLen(Arrays.copyOfRange(nums, i + 1, nums.length)));
            }
        }
        int max = -1;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                min = Math.min(min, i);
                max = Math.max(max, i);
                count++;
            }
        }
        if (count % 2 == 0)
            return nums.length;
        return Math.max(nums.length - 1 - min, max);
    }
}
