package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/24
    time 7:56 PM
*/

public class ReverseString {
    public void reverseString(char[] s) {
        if (null == s || s.length < 2)
            return;
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
