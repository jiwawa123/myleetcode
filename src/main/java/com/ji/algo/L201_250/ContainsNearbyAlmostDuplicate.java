package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/21
    time 9:26 PM
*/

public class ContainsNearbyAlmostDuplicate {
    public static void main(String[] args) {

    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                if (Math.abs((long)nums[j] - nums[i]) <= t)
                    return true;
            }
        }
        return false;
    }
}
