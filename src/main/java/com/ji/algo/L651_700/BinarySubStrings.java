package com.ji.algo.L651_700;/*
    user ji
    data 2019/5/12
    time 2:06 PM
*/

public class BinarySubStrings {
    public static void main(String[] args) {
        System.out.println(new BinarySubStrings().countBinarySubstrings("00110011"));
    }

    public int countBinarySubstrings(String s) {
        int last, cur, res;
        last = res = 0;
        cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) cur++;
            else {
                last = cur;
                cur = 1;
            }
            if (last >= cur) res++;
        }
        return res;
    }


}
