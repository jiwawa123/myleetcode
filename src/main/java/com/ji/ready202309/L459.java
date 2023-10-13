package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/12/23:25
 */
public class L459 {
    public static void main(String[] args) {
        repeatedSubstringPattern("aba");
    }

    public static boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }
        int len = s.length();
//        if (len % 2 == 0) {
//            return s.substring(0, len / 2).equals(s.substring(len / 2));
//        }

        for (int i = 1; i <= len / 2; i++) {
            if (len % i != 0) {
                continue;
            }
            String tmp = s.substring(0, i);
            int j = 0;
            for (; j < len; j += i) {
                if (!s.substring(j, j + i).equals(tmp)) {
                    break;
                }
            }
            if (j == len) {
                return true;
            }
        }

        return false;
    }
}
