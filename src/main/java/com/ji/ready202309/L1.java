package com.ji.ready202309;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/06/22:56
 */
public class L1 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr = {0, 0};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
                return arr;
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}
