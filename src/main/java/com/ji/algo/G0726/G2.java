package com.ji.algo.G0726;

import java.util.Arrays;

/**
 * user ji
 * data 2020/7/26
 * time 10:16 上午
 */
public class G2 {
    public static void main(String[] args) {
        System.out.println(minFlips("10111"));
    }

    public static int minFlips(String target) {
        int res = 0;
        char tmp = '0';
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != tmp) {
                res++;
                tmp = target.charAt(i);
            }
        }
        return res;
    }
}
