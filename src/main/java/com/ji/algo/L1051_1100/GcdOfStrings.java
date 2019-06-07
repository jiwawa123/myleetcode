package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/6/7
    time 11:01 AM
*/

public class GcdOfStrings {
    public static void main(String[] args) {
        System.out.println("hello".substring(0,1));
    }

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length())
            return "";
        for (int i = str2.length(); i > 0; i--) {
            if (isMatch(str2, str2.substring(0, i)) && isMatch(str1, str2.substring(0, i))) {
                return str2.substring(0, i);
            }
        }
        return "";
    }

    public boolean isMatch(String str1, String str2) {
        if (str1.length() % str2.length() != 0) {
            return false;
        }
        for (int i = 0; i < str1.length(); i += str2.length()) {
            if (!str1.substring(i, i + str2.length()).equals(str2))
                return false;
        }
        return true;
    }
}
