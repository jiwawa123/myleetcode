package com.ji.algo.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/23/09:55
 */
public class Offer016 {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        int max = 0;
        int last = -1;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) || map.get(s.charAt(i)) < last) {
                len++;
            } else {
                last = map.get(s.charAt(i)) + 1;
                len = i - last + 1;
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, len);
        }

        return max;
    }
}
