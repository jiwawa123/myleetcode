package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/11/12:06
 */
public class L0611_2 {
    public static void main(String[] args) {
        System.out.println(longestSemiRepetitiveSubstring("00121344511323"));
    }

    public static int longestSemiRepetitiveSubstring(String s) {
        int res = 0;
        int len = 1;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    if (index == -1) {
                        len++;

                    } else {
                        len = i - index + 1;
                    }
                    index = i;
                } else {
                    len++;
                }
            }
            res = Math.max(res, len);
        }
        return res;
    }
}
