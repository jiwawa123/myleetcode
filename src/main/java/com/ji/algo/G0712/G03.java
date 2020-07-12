package com.ji.algo.G0712;

import java.util.Arrays;

/**
 * user ji
 * data 2020/7/12
 * time 12:20 下午
 */
public class G03 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 0, 10, 14};
        System.out.println(minDifference(arr));
    }

    public static int minDifference(int[] nums) {
        if (nums.length <= 3)
            return 0;
        Arrays.sort(nums);
        // 左右都变
        int l = nums[3];
        int r = nums[nums.length - 4];
        int res = Math.min(nums[nums.length - 1] - l, r - nums[0]);
        // 左2右1
        l = nums[2];
        r = nums[nums.length - 2];
        int min = Math.min(nums[nums.length - 2] - l, r - nums[2]);
        res = Math.min(min, res);
        // 左1右2
        l = nums[1];
        r = nums[nums.length - 3];
        min = Math.min(nums[nums.length - 3] - l, r - nums[1]);
        res = Math.min(res, min);
        return res;
    }
}
