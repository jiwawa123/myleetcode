package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/3
    time 10:19 PM
*/

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x == 0 || x < 10)
            return true;
        String tmp = x + "";
        int start = 0, end = tmp.length() - 1;
        while (start < end) {
            if (tmp.charAt(start++) != tmp.charAt(end--))
                return false;
        }
        return true;
    }
}
