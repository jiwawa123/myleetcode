package com.ji.algo.L2701_2750;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/02/12:02
 */
public class L2744 {
    public static void main(String[] args) {

    }

    public int maximumNumberOfStringPairs(String[] words) {
        int res = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String reverse = reverse(words[i]);
            if (set.contains(reverse)) {
                res++;
            }
            set.add(words[i]);
        }
        return res;
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
