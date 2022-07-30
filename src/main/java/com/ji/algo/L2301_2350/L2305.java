package com.ji.algo.L2301_2350;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/26/上午8:20
 */
public class L2305 {
    public static void main(String[] args) {

    }

    public int distributeCookies(int[] cookies, int k) {
        Arrays.sort(cookies);
        if (k == cookies.length) {
            return cookies[cookies.length - 1];
        }
        int count = 0;
        for (int i = 0; i < cookies.length; i++) {
            count += cookies[i];
        }
        int avg = count / k;
        return Math.max(cookies[cookies.length - 1], count - (avg * cookies.length - 1));
    }
}
