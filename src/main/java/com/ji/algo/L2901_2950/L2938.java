package com.ji.algo.L2901_2950;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/04/16:01
 */
public class L2938 {

    public long minimumSteps(String s) {
        long res = 0;
        long zero = 0, one = 0;
        int right = s.length() - 1;
        while (right >= 0) {
            if (s.charAt(right--) == '0') {
                zero++;
            } else {
                res += zero;
            }
        }


        return res;
    }
}
