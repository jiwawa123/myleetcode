package com.ji.algo.L551_600;/*
    user ji
    data 2019/5/9
    time 10:09 PM
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckRecord {
    public static void main(String[] args) {
        checkRecord("PPALLL");
    }

    public static boolean checkRecord(String s) {
        int a = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                a++;
                if (a > 1)
                    return false;
            }
            i++;
        }
        return !s.contains("lll");
    }
}
