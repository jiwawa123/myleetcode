package com.ji.algo.L1651_1700;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/12/26
 * time 12:07 上午
 */
public class L1695 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 5, 1, 2, 7};
        System.out.println(maximumUniqueSubarray(arr));
    }

    public static int maximumUniqueSubarray(int[] nums) {
        int max = 0;
        int tmp = 0;
        int arr[] = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            arr[i] += nums[i];
            if (i > 0) {
                arr[i] += arr[i - 1];
            }
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int last = map.getOrDefault(nums[i], -1);
            if (last < index) {
                if (index > 0) {
                    tmp = arr[i] - arr[index - 1];
                } else {
                    tmp = arr[i];
                }
            } else {
                tmp = arr[i] - arr[last];
                index = last + 1;
            }
            map.put(nums[i], i);
            max = Math.max(max, tmp);
        }
        return max;
    }
}
