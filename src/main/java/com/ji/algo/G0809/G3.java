package com.ji.algo.G0809;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/8/9
 * time 2:10 下午
 */
public class G3 {
    public static void main(String[] args) {
        int arr[] = {-2, 6, 6, 3, 5, 4, 1, 2, 8};
        System.out.println(maxNonOverlapping(arr, 10));
    }

    public static int maxNonOverlapping(int[] nums, int target) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == target) {
                res++;
                sum = 0;
                map = new HashMap<>();
                continue;
            }
            if (map.containsKey(sum - target)) {
                res++;
                sum = 0;
                map = new HashMap<>();
            } else {
                map.put(sum, 1);
            }
        }
        return res;
    }
}
