package com.ji.algo.L3001_3050;

import com.ji.algo.L251_300.HIndex;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/09/22:32
 */
public class L3005 {
    public static void main(String[] args) {

    }

    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > max) {
                max = map.get(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == max) {
                res++;
            }
        }
        return res;
    }
}
