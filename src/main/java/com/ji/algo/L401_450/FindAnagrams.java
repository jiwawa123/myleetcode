package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/3
    time 10:41 AM
*/

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {

    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length() - p.length(); i++) {
            if (help(s.substring(i, i + p.length()), p))
                list.add(i);
        }
        return list;
    }

    public boolean help(String a, String b) {
        int arr[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < b.length(); i++) {
            if (arr[b.charAt(i) - 'a'] <= 0)
                return false;
            arr[b.charAt(i) - 'a'] -= 1;
        }
        return true;
    }
}
