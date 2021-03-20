package com.ji.algo.L1701_1750;

import java.util.Arrays;

/**
 * user ji
 * data 2021/2/12
 * time 9:45 下午
 */
public class L1748 {
    public static void main(String[] args) {

    }

    public int sumOfUnique(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int res = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                res += nums[i];
        }
        if (nums.length > 1 && nums[0] != nums[1])
            res += nums[0];
        if (nums.length > 2 && nums[nums.length - 1] != nums[nums.length - 2])
            res += nums[nums.length - 1];
        return res;
    }
}
