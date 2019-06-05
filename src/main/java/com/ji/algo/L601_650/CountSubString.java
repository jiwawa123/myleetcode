package com.ji.algo.L601_650;/*
    user ji
    data 2019/6/5
    time 9:19 AM
*/

public class CountSubString {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }

    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i,j));
                if(isMatch(s.substring(i,j)))
                    count++;
            }
        }
        return count;
    }

    public static boolean isMatch(String s) {
        if (s.length() == 1)
            return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

}
