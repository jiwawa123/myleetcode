package com.ji.algo.L301_350;/*
    user ji
    data 2019/5/2
    time 1:12 PM
*/

import java.util.Arrays;

public class CountBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int num) {
        int res[] = new int[num + 1];
        res[0] = 0;
        int tmp = 1;
        for (int i = 1; i <= num; i++) {
            if (i == tmp*2) {
                res[i] = 1;
                tmp *= 2;
                continue;
            } else {
                res[i] = 1 + res[i - tmp];
            }
        }
        return res;
    }
}
