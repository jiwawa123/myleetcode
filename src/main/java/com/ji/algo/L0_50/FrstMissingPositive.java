package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/11
    time 8:45 AM
*/

import java.util.HashMap;
import java.util.Map;

public class FrstMissingPositive {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int res = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
            while (map.containsKey(res)) {
                res++;
            }
        }
        return res;
    }
}
