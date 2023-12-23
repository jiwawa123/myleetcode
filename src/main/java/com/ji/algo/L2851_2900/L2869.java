package com.ji.algo.L2851_2900;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/29/21:45
 */
public class L2869 {
    public static void main(String[] args) {

    }

    public int minOperations(List<Integer> nums, int k) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        int len = nums.size() - 1;
        while (set.size() < k) {
            int t = nums.get(len--);
            if (t <= k) {
                set.add(t);
            }
            res++;
        }
        return res;

    }
}
