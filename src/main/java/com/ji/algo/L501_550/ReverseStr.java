package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/9
    time 10:31 PM
*/

public class ReverseStr {
    public static void main(String[] args) {

    }

    public String reverseStr(String s, int k) {
        int i = 0;
        boolean flag = true;
        StringBuffer sp = new StringBuffer();
        while (i < s.length()) {
            if (flag) {
                if (i + k < s.length()) {
                    sp.append(new StringBuffer(s.substring(i, i + k)).reverse());
                } else {
                    sp.append(new StringBuffer(s.substring(i, s.length())).reverse());
                }
            } else {
                if (i + k < s.length()) {
                    sp.append(new StringBuffer(s.substring(i, i + k)));
                } else {
                    sp.append(new StringBuffer(s.substring(i, s.length())));
                }
            }
            i += k;
        }
        return sp.toString();
    }
}
