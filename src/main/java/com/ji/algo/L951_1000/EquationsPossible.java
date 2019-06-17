package com.ji.algo.L951_1000;/*
    user ji
    data 2019/6/17
    time 8:09 PM
*/

import java.util.Arrays;

public class EquationsPossible {
    public static void main(String[] args) {
        String arr[] = {"f==b", "c==b", "c==b", "e!=f"};
        System.out.println(equationsPossible(arr));
    }

    public static boolean equationsPossible(String[] a) {
        char arr[] = new char[26];
        Arrays.fill(arr, '-');
        for (int i = 0; i < a.length; i++) {
            char t1 = a[i].charAt(0);
            char t2 = a[i].charAt(3);
            if (a[i].charAt(1) == '=') {
                if (a[i].charAt(0) == a[i].charAt(3))
                    continue;
                while (arr[t1 - 'a'] != '-') {
                    t1 = arr[t1 - 'a'];
                }
                while (arr[t2 - 'a'] != '-') {
                    t2 = arr[t2 - 'a'];
                }
                if(t1==t2)
                    continue;
                if (t1 > t2) {
                    arr[t1 - 'a'] = t2;
                } else {
                    arr[t2 - 'a'] = t1;
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            char t1 = a[i].charAt(0);
            char t2 = a[i].charAt(3);
            if (a[i].charAt(1) == '!') {
                if (t1 == t2)
                    return false;
                while (arr[t1 - 'a'] != '-') {
                    t1 = arr[t1 - 'a'];
                }
                while (arr[t2 - 'a'] != '-') {
                    t2 = arr[t2 - 'a'];
                }
                if (t1 == t2)
                    return false;
            }
        }
        return true;
    }
}
