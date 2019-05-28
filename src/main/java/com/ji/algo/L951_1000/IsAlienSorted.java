package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/28
    time 11:03 AM
*/

import java.util.*;

public class IsAlienSorted {
    public static void main(String[] args) {
        String arr[] = {"word", "world", "row"};
        isAlienSorted(arr, "worldabcefghijkmnpqstuvxyz");
    }

    public static boolean isAlienSorted(String[] words, String order) {
        int arr[] = new int[26];
        for (int i = 0; i < order.length(); i++) {
            arr[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            if (match(words[i], words[i - 1], arr) < 0)
                return false;
        }
        return true;
    }

    public static int match(String a, String b, int arr[]) {
        int i = 0;
        while (i < a.length() && i < b.length()) {
            if (arr[a.charAt(i) - 'a'] < arr[b.charAt(i) - 'a']) {
                return -1;
            }
            if (arr[a.charAt(i) - 'a'] > arr[b.charAt(i) - 'a']) {
                return 1;
            }
            i++;
        }
        if (i < a.length()) {
            return 1;
        }
        return -1;
    }
}
