package com.ji.algo.L2151_2200;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/02/20/下午12:18
 */
public class L2165 {
    public static void main(String[] args) {
        System.out.println(smallestNumber(-7605));
    }

    public static long smallestNumber(long num) {
        String number = String.valueOf(num);
        if (num < 0) {
            number = number.substring(1);
        }
        char[] chars = number.toCharArray();
        Arrays.sort(chars);
        StringBuilder sp = new StringBuilder();
        if (num < 0) {
            return Long.valueOf(new StringBuilder(String.copyValueOf(chars)).reverse().toString()) * -1;
        } else {

            StringBuilder sp1 = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != '0') {
                    sp.append(chars[i]);
                } else {

                    sp1.append('0');
                }
            }
            if (sp.length() == 0) {
                return 0;
            }
            return Long.valueOf(sp.toString().charAt(0) + sp1.toString() + sp.toString().substring(1));

        }
    }
}
