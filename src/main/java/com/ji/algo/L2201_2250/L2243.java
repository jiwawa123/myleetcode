package com.ji.algo.L2201_2250;

/**
 * @Author: Bei Chang
 * @Date: 2022/04/30/下午10:45
 */
public class L2243 {
    public static void main(String[] args) {
        String str = "00000000";
        System.out.println(digitSum(str, 3));
    }

    public static String digitSum(String s, int k) {
        if (s == null || s.length() <= k) {
            return s;
        }
        StringBuilder sp = new StringBuilder(s);
        while (sp.length() > k) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < sp.length(); i += k) {
                int t = 0;
                for (int j = i; j < sp.length() && j < i + k; j++) {
                    t += sp.charAt(j) - '0';
                }
                next.append(t);
            }
            sp = next;
        }
        return sp.toString();
    }
}
