package com.ji.algo.L1901_1950;

/**
 * user ji
 * data 2021/7/1
 * time 3:18 下午
 */
public class L1909 {
    public static void main(String[] args) {

    }

    public boolean canBeIncreasing(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length && cnt <= 1; i++) {
            if (nums[i] > nums[i - 1]) continue;
            cnt++;
            if (i - 1 > 0 && nums[i] <= nums[i - 2]) {
                nums[i] = nums[i - 1];
            }
        }
        return cnt <= 1;
    }


}
