package com.ji.algo.L1801_1850;

import java.util.HashSet;
import java.util.Set;

/**
 * user ji
 * data 2021/3/28
 * time 5:31 下午
 */
public class L5713 {
    public static void main(String[] args) {
        System.out.println(numDifferentIntegers("leet1234code234"));
    }

    public static int numDifferentIntegers(String word) {
        Set<Integer> set = new HashSet<>();
        int cur = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                if (cur == -1) {
                    cur = word.charAt(i) - '0';
                } else {
                    cur = cur * 10 + word.charAt(i) - '0';
                }
            } else {
                if (cur != -1) {
                    set.add(cur);
                    cur = -1;
                }
            }
        }
        if (cur != -1)
            set.add(cur);


        return set.size();
    }
}
