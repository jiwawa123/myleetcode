package com.ji.algo.L2801_2850;

import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/24/20:40
 */
public class L2824 {
    public static void main(String[] args) {

    }

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
