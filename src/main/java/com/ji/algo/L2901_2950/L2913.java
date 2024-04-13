package com.ji.algo.L2901_2950;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/13/20:12
 */
public class L2913 {
    public static void main(String[] args) {

    }

    public int sumCounts(List<Integer> nums) {
        int max = (int) Math.pow(10, 9) + 7;
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));
                res += (set.size() * set.size() % max);
            }
        }


        return res % max;
    }
}
