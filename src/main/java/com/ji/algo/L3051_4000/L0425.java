package com.ji.algo.L3051_4000;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/24/18:13
 */
public class L0425 {
    public static void main(String[] args) {
        System.out.println(maximumLengthSubstring("bcbbbcba"));
    }

    public static int maximumLengthSubstring(String s) {
        int res = 0;
        int left = 0, right = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            int len = map.getOrDefault(c, 0);
            if (len >= 2) {
                while (map.getOrDefault(c, 0) >= 2 && left < right) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                    left++;
                }
            }
            map.put(c, map.getOrDefault(c, 0) + 1);
            right++;
            res = Math.max(res, right - left);

        }
        return res;
    }
}
