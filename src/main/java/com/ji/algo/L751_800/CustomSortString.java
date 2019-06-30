package com.ji.algo.L751_800;/*
    user ji
    data 2019/6/30
    time 9:34 AM
*/

import java.util.Arrays;
import java.util.Comparator;

public class CustomSortString {
    public static void main(String[] args) {
        System.out.println(customSortString("cba","abcd"));
    }

    public static String customSortString(String S, String T) {
        int arr[] = new int[26];
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a'] = i + 1;
        }
        char tmp[] = T.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp.length - i - 1; j++) {
                if (arr[tmp[j] - 'a'] > arr[tmp[j + 1] - 'a']) {
                    char temp = tmp[j];
                    tmp[j] = tmp[j+1];
                    tmp[j+1] = temp;
                }
            }
        }
        return String.valueOf(tmp);
    }

}
