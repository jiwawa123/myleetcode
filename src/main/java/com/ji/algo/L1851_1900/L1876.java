package com.ji.algo.L1851_1900;

/**
 * user ji
 * data 2021/6/4
 * time 7:25 下午
 */
public class L1876 {
    public static void main(String[] args) {
        countGoodSubstrings("aababcabc");
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 3 > s.length())
                break;
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 2) || s.charAt(i + 1) == s.charAt(i + 2))
                continue;
            System.out.println(s.substring(i, i + 3));
            count++;
        }

        return count;
    }
}
