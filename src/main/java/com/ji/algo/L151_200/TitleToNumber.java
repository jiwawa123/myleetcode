package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 8:10 PM
*/

public class TitleToNumber {
    public static void main(String[] args) {

    }

    public int titleToNumber(String s) {
        int re = 0;
        for (int i = 0; i < s.length(); i++) {
            re += (s.charAt(i) - 'A' + 1) * Math.pow(26, (s.length() - 1 - i));
        }
        return re;
    }
}
