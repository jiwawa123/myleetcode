package com.ji.algo.L551_600;/*
    user ji
    data 2019/6/30
    time 12:15 PM
*/

import java.util.HashMap;
import java.util.Map;

public class FindLHS {
    public static void main(String[] args) {

    }

    public int findLHS(int[] nums) {
        if (nums == null || nums.length < 1)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for (int t : map.keySet()
                ) {
            if (map.containsKey(t - 1)) {
                max = Math.max(max, map.get(t) + map.get(t - 1));
            }
            if (map.containsKey(t + 1)) {
                max = Math.max(max, map.get(t) + map.get(t + 1));
            }
        }
        return max;
    }
}
