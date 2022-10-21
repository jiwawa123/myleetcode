package com.ji.algo.L2401_2450;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2022/10/21/下午9:11
 */
public class L2442 {
    public static void main(String[] args) {

    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n:nums
             ) {
            set.add(n);
            StringBuilder sp = new StringBuilder();
            sp.append(n);
            set.add(Integer.parseInt(sp.reverse().toString()));
        }
        return set.size();
    }
}
