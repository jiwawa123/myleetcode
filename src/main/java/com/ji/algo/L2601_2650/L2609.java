package com.ji.algo.L2601_2650;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/22/13:21
 */
public class L2609 {
    public static void main(String[] args) {
        System.out.println(findTheLongestBalancedSubstring("10"));
//        System.out.println(findTheLongestBalancedSubstring("00111"));
    }

    public static int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = 0, b = 0;
            if (s.charAt(i) == '0') {
                a++;
            } else {
                b++;
            }
            if (b > a) {
                continue;
            }
            for (int j = i + 1; j < s.length(); j++) {
                String tmp = s.substring(i, j);
                if (tmp.contains("10")) {
                    break;
                }
                if (s.charAt(j) == '0') {
                    a++;
                } else {
                    b++;
                }
                if (b > a) {
                    break;
                }
                if (a == b) {
                    res = Math.max(res, a + b);
                }

            }
        }
        return res;
    }

}
