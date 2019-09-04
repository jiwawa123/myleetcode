package com.ji.algo.L351_400;/*
    user ji
    data 2019/8/25
    time 8:37 PM
*/

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {

    }

    //使用分治的思想，分成左右两边即可
    public int longestSubstring(String s, int k) {
        int max = 0;
        if (s == null || s.length() < k)
            return 0;
        if (k < 2)
            return s.length();
        return longestSubStringSub(s, k, 0, s.length() - 1);
    }

    public int longestSubStringSub(String s, int k, int start, int end) {
        if (start > end)
            return 0;
        int arr[] = new int[26];
        for (int i = start; i < end; i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0 && arr[i] < k) {//开始进行分治
                int pos = s.indexOf((char) ('a' + i), start);
                return Math.max(longestSubStringSub(s, k, start, pos - 1), longestSubStringSub(s, k, pos + 1, end));
            }
        }
        return end - start + 1;
    }
}
