package com.ji.algo.L301_350;/*
    user ji
    data 2019/9/14
    time 11:47 AM
*/

import java.util.HashMap;

public class MaximumSizeSubarraySumEqualsk {
    public static void main(String[] args) {

    }

    public int getLongSumK(int nums[], int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                max = Math.max(max, i + 1);
            }

            int diff = sum - k;

            if (map.containsKey(diff)) {
                max = Math.max(max, i - map.get(diff));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return max;
    }
}
