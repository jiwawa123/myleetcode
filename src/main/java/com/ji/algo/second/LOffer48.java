package com.ji.algo.second;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/8/14
 * time 8:12 上午
 */
public class LOffer48 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() < 2)
            return 1;
        Map<Character, Integer> map = new HashMap<>();
        int max = 1;
        int left = -1;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                left = Math.max(left, map.get(s.charAt(i)));
                map.put(s.charAt(i), i);
            }
            max = Math.max(max, i - left);

        }
        return max;
    }
}
