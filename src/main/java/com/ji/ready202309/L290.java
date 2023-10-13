package com.ji.ready202309;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/09:31
 */
public class L290 {
    public static void main(String[] args) {

    }

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(strs[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), strs[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(strs[i])) {
                    return false;
                }
            }
        }


        return true;


    }
}
