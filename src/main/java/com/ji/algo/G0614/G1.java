package com.ji.algo.G0614;

/**
 * user ji
 * data 2020/6/14
 * time 10:16 上午
 */
public class G1 {
    public static void main(String[] args) {

    }
    public int[] runningSum(int[] nums) {
        int res[] = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i]+res[i-1];
        }
        return res;
    }
}
