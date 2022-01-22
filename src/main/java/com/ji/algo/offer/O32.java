package com.ji.algo.offer;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/22/下午9:25
 */
public class O32 {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        if (s.equals(t) || s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (char a : s.toCharArray()
        ) {
            arr[a - 'a'] += 1;
        }
        for (char a : t.toCharArray()
        ) {
            if (arr[a - 'a'] >= 1) {
                arr[a - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
