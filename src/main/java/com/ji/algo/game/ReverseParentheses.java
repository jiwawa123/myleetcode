package com.ji.algo.game;/*
    user ji
    data 2019/9/15
    time 10:41 AM
*/

public class ReverseParentheses {
    public static void main(String[] args) {
        System.out.println(reverseParentheses("(ed(et(oc))el)"));
    }

    public static String reverseParentheses(String s) {
        return help(s);
    }

    public static String help(String s) {
        if (s == null || s.length() == 0 || !s.contains("("))
            return s;
        int start = 0, end = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                start = i;
            }
            if (s.charAt(i) == ')') {
                end = i;
                break;
            }
        }
        StringBuilder sp = new StringBuilder(s.substring(start + 1, end));
        return help(s.substring(0, start) + sp.reverse() + s.substring(end + 1, s.length()));
    }
}
