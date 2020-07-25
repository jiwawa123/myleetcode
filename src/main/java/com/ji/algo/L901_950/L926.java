package com.ji.algo.L901_950;

import java.util.ArrayList;
import java.util.List;

/**
 * user ji
 * data 2020/7/24
 * time 3:58 下午
 */
public class L926 {
    public static void main(String[] args) {
        System.out.println(minFlipsMonoIncr("110010011"));
    }

    public static int minFlipsMonoIncr(String S) {
        int one = 0, zero = 0;
        for (char a : S.toCharArray()
        ) {
            if (a == '1') {
                one = Math.min(zero, one);
                zero += 1;
            } else {
                one = Math.min(zero + 1, one + 1);
            }
        }

        return Math.min(one, zero);
    }
}
