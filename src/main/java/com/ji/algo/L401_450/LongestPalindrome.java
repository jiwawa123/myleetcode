package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/3
    time 9:32 AM
*/

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println((int) ('0'));
    }

    public int longestPalindrome(String s) {
        if (null == s)
            return 0;
        if (s.length() < 2)
            return s.length();
        int arr[] = new int[122];
        for (int i = 0; i < s.length(); i++) {
            arr[(int) (s.charAt(i))] += 1;
        }
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i] % 2 == 0 ? arr[i] : arr[i] - 1;
        }
        return tmp == s.length() ? tmp : tmp + 1;
    }
}
