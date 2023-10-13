package com.ji.ready202309;

import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/11/22:32
 */
public class L678 {
    public static void main(String[] args) {

        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))((*()()(((()((()*(())*(()**)()(())";
        System.out.println(checkValidString(s));
    }


    public static boolean checkValidString(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        boolean f = false;
        if (!f) {
            int l = 0, m = 0, r = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {

                    l++;
                } else if (s.charAt(i) == '*') {
                    m++;
                } else {
                    r++;
                }
                if (r > l + m) {
                    return false;
                }
            }
            f = m >= Math.abs(l - r);
        }
        if (f) {
            int l = 0, m = 0, r = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '(') {

                    l++;
                } else if (s.charAt(i) == '*') {
                    m++;
                } else {
                    r++;
                }
                if (l > r + m) {
                    return false;
                }
            }
            return m >= Math.abs(l - r);
        } else {
            return false;
        }
    }


}
