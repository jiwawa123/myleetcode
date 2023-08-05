package com.ji.algo.L2751_2800;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/05/11:56
 */
public class L2799 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 2};
        countCompleteSubarrays(arr);
    }

    public static int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count = set.size();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> tmp = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                tmp.add(nums[j]);
                if (tmp.size() == count) {
                    res += (nums.length - j);
                    break;
                }
            }
        }
        return res;
    }
}
