package com.ji.ready202309;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/09:26
 */
public class L205 {
    public static void main(String[] args) {

    }

    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }

            if (map1.containsKey(t.charAt(i))) {
                if (map1.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }

            map.put(s.charAt(i), t.charAt(i));
            map1.put(t.charAt(i), s.charAt(i));
        }

        return true;
    }
}
