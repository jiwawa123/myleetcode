package com.ji.algo.game.G0419;

import java.util.*;

/**
 * user ji
 * data 2020/4/19
 * time 10:18 AM
 */
public class G3 {
    public static void main(String[] args) {
    }

    static String word = "croak";

    public static int minNumberOfFrogs(String croakOfFrogs) {
        int c, r, o, a, k;
        c = 0;
        r = 0;
        o = 0;
        a = 0;
        k = 0;
        char[] chars = croakOfFrogs.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'c') {
                if (k > 0) {
                    k--;
                } else {
                    res++;
                }
                c++;
            } else if (chars[i] == 'r') {
                c--;
                r++;
            } else if (chars[i] == 'o') {
                r--;
                o++;
            } else if (chars[i] == 'a') {
                o--;
                a++;
            } else if (chars[i] == 'k') {
                a--;
                k++;
            }
            if (c < 0 || r < 0 || o < 0 || a < 0) {
                break;
            }
        }
        if (c != 0 || r != 0 || o != 0 || a != 0) {
            return -1;
        }
        return res;
    }
}
