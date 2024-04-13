package com.ji.algo.L3001_3050;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/13/20:54
 */
public class L3106 {
    public static void main(String[] args) {
        System.out.println(getSmallestString("xaxcd", 4));
    }

    public static String getSmallestString(String s, int k) {
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (k <= 0 || s.charAt(i) == 'a') {
                sp.append(s.charAt(i));
                continue;
            }

            int distinct = Math.min(s.charAt(i) - 'a', ('a' + 26 - s.charAt(i)));
            if (k < distinct) {
                sp.append((char) (s.charAt(i) - k));
                k = 0;
            } else {
                sp.append('a');
                k -= distinct;
            }
        }
        return sp.toString();
    }
}
