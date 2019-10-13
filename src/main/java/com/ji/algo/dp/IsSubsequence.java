package com.ji.algo.dp;/*
    user ji
    data 2019/10/8
    time 10:47 AM
*/

public class IsSubsequence {
    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        if (s == null && t == null)
            return true;
        if (s == null || s.length() == 0)
            return true;
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == s.length();
    }
}
