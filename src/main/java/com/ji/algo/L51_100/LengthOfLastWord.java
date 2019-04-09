package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 1:56 PM
*/

public class LengthOfLastWord {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        if (null == s || s.equals(""))
            return 0;
        s = s.trim();
        String str[] = s.split(" ");
        return str[str.length - 1].length();

    }
}
