package com.ji.algo.L2901_2950;

/**
 * @Author: Bei Chang
 * @Date: 2023/12/12/10:11
 */
public class L2937 {
    public static void main(String[] args) {
        new L2937().findMinimumOperations("oby", "obz", "obf");
    }

    public int findMinimumOperations(String s1, String s2, String s3) {
        int len = Math.min(s1.length(), s2.length());
        len = Math.min(s3.length(), len);
        String tmp = null;
        if (len == s1.length()) {
            tmp = s1;
        }

        if (len == s2.length()) {
            tmp = s2;
        }

        if (len == s3.length()) {
            tmp = s3;
        }

        for (int i = 1; i < tmp.length() + 1; i++) {
            String t = tmp.substring(0, i);
            if (!s1.startsWith(t) || !s2.startsWith(t) || !s3.startsWith(t)) {
                if (i == 1) {
                    return -1;
                }

                return s1.length() - i - 1 + s2.length() - i - 1 + s3.length() - i - 1;
            }
        }
        int res = 0;
        if (!tmp.equals(s1)) {
            res += s1.length() - tmp.length();
        }

        if (!tmp.equals(s2)) {
            res += s2.length() - tmp.length();
        }

        if (!tmp.equals(s3)) {
            res += s3.length() - tmp.length();
        }
        return res;
    }
}
