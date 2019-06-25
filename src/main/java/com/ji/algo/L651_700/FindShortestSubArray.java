package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/25
    time 10:15 PM
*/

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {
    public static void main(String[] args) {

    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> start = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (!start.containsKey(nums[i])) {
                start.put(nums[i], i);
            }
            end.put(nums[i], i);
        }
        int max = Integer.MAX_VALUE;
        int count = 0;
        for (int k : map.keySet()
                ) {
            count = Math.max(count, map.get(k));
        }
        for (int k : start.keySet()) {
            if (map.get(k) == count) {
                max = Math.min(end.get(k) - start.get(k)+1,max);
            }
        }
        return max;
    }
}
