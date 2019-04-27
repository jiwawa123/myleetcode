package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/23
    time 7:51 PM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.equals("") && t.equals(""))
            return true;
        if (s.equals("") || t.equals(""))
            return false;
        if (s.length() != t.length())
            return false;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return String.valueOf(s1).equals(String.valueOf(t1));

    }

    public boolean isAnagramII(String s, String t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < t.length(); i++) {
            if (arr[t.charAt(i) - 'a'] <= 0) {
                return false;
            } else {
                arr[t.charAt(i) - 'a'] -= 1;
            }
        }
        return true;
    }
}
