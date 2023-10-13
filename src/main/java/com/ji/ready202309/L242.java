package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/09:35
 */
public class L242 {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (char a : s.toCharArray()) {
            arr[a - 'a'] += 1;
        }

        for (char a : t.toCharArray()
        ) {
            arr[a - 'a'] -= 1;
            if (arr[a - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
