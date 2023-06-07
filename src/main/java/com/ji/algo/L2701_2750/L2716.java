package com.ji.algo.L2701_2750;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/07/22:29
 */
public class L2716 {
    public static void main(String[] args) {

    }

    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}
