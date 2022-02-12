package com.ji.algo.L2151_2200;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2022/02/06/下午7:19
 */
public class L2154 {
    public static void main(String[] args) {

    }

    public int findFinalValue(int[] nums, int original) {

        Set<Integer> set = new HashSet<>();
        for (Integer t : nums
        ) {
            set.add(t);
        }
        while (set.contains(original)) {
            original *= 2;
        }
        return original;
    }
}
