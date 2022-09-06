package com.ji.algo.L2351_2400;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/01/上午8:22
 */
public class L2380 {
    public static void main(String[] args) {

    }

    public int secondsToRemoveOccurrences(String s) {
        int res = 0;
        while (s.indexOf("01") != -1) {
            s = s.replaceAll("01", "10");
            res++;
        }
        return res;
    }
}
