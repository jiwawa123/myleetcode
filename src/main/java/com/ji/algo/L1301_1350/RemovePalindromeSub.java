package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/29
    time 7:22 PM
*/

public class RemovePalindromeSub {
    public static void main(String[] args) {

    }

    public int removePalindromeSub(String s) {
        if (s.length() == 0)
            return 0;
        return help(s) ? 1 : 2;
    }

    public boolean help(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
