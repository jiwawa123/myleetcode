package com.ji.algo.L551_600;/*
    user ji
    data 2019/5/9
    time 10:00 PM
*/

public class ReverseWords {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        if (s == null || s.equals(""))
            return s;
        String str[] = s.split(" ");
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            sp.append(new StringBuffer(str[i]).reverse());
            if (i != str.length) {
                sp.append(" ");
            }
        }
        return sp.toString();
    }
}
