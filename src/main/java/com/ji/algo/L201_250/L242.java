package com.ji.algo.L201_250;

/**
 * user ji
 * data 2020/11/22
 * time 8:58 上午
 */
public class L242 {
    public static void main(String[] args) {
        isAnagram("aacc", "ccac");
    }

    public static boolean isAnagram(String s, String t) {
        if (s.equals(t))
            return true;
        if (s.length() != t.length())
            return false;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            arr[index] -= 1;
            if (arr[index] < 0)
                return false;
        }
        return true;
    }
}
