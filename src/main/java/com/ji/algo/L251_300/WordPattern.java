package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 9:22 PM
*/

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {

    }

    public boolean wordPattern(String pattern, String str) {
        if (null == pattern && null == str)
            return true;
        if (null == pattern || null == str)
            return false;
        if (pattern.length() != str.split(" ").length)
            return false;
        String tmp[] = str.split(" ");
        Map<String, Character> map_str = new HashMap<>();
        Map<Character, String> map_pattern = new HashMap<>();
        for (int i = 0; i < tmp.length; i++) {
            if (!map_str.containsKey(tmp[i]) && !map_pattern.containsKey(pattern.charAt(i))) {
                map_str.put(tmp[i], pattern.charAt(i));
                map_pattern.put(pattern.charAt(i), tmp[i]);
                continue;
            }
            if (map_str.containsKey(tmp[i])) {
                if (map_str.get(tmp[i]) != pattern.charAt(i))
                    return false;
            }
            if (map_pattern.containsKey(pattern.charAt(i))) {
                if (!map_pattern.get(pattern.charAt(i)).equals(tmp[i]))
                    return false;
            }

        }
        return true;
    }
}
