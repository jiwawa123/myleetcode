package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/11
    time 8:45 AM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrstMissingPositive {
    public static void main(String[] args) {
        int arr[] = {3, 4, 0, 2};
        System.out.println(firstMissingPositiveII(arr));
    }

    public int firstMissingPositive(int[] nums) {
        int res = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);

        }
        while (map.containsKey(res)) {
            res++;
        }
        return res;
    }

    public static int firstMissingPositiveII(int[] nums) {
        if (nums == null || nums.length == 0)
            return 1;
        Arrays.sort(nums);
        if (nums[0] > 1)
            return 1;
        int res = 1;
        int next = 1;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < res)
                continue;
            if (nums[i] == res) {
                flag = true;
                next = res + 1;
                continue;
            }
            if (flag) {
                if (nums[i] - res == 1) {
                    res = nums[i];
                    next = res + 1;
                    continue;
                } else {
                    return next;
                }
            }
        }
        return next;
    }
}
