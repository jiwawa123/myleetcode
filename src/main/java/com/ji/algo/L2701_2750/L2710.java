package com.ji.algo.L2701_2750;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/03/18:06
 */
public class L2710 {
    public static void main(String[] args) {

    }

    public String removeTrailingZeros(String num) {
        int len = num.length() - 1;

        while (num.charAt(len) == '0' && len >= 0) {
            len--;
        }
        return num.substring(0, len + 1);
    }
}
