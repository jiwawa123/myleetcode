package com.ji.algo.L2251_2300;

/**
 * @Author: Bei Chang
 * @Date: 2022/05/02/上午10:45
 */
public class L2255 {
    public static void main(String[] args) {

    }

    public int countPrefixes(String[] words, String s) {
        int res = 0;
        for (String str : words
        ) {
            res += s.startsWith(str) ? 1 : 0;
        }
        return res;
    }
}
