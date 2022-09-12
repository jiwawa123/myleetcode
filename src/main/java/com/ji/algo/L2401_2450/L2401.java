package com.ji.algo.L2401_2450;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/12/上午11:49
 */
public class L2401 {
    public static void main(String[] args) {

    }

    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        for (char a : s.toCharArray()
        ) {
            if (set.contains(a)) {
                res++;
                set = new HashSet<>();
            }
            set.add(a);
        }
        return res;
    }
}
