package com.ji.algo.L2801_2850;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/30/08:50
 */
public class L2848 {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            int start = nums.get(i).get(0);
            int end =  nums.get(i).get(1);
            for (int j = start; j <= end; j++) {
                set.add(j);
            }
        }
        return set.size();
    }
}
