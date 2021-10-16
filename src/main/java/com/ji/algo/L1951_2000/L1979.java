package com.ji.algo.L1951_2000;

import java.util.Arrays;

/**
 * @author ji
 * @data 2021/8/29
 * @time 9:07 下午
 */
public class L1979 {
    public static void main(String[] args) {

    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return getMaxDivisor(nums[nums.length-1],nums[0]);
    }

    public int getMaxDivisor(int a, int b) {
        if (b == 0)
            return a;
        return getMaxDivisor(b, a % b);
    }
}
