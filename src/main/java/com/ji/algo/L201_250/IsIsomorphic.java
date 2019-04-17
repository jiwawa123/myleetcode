package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/17
    time 9:06 PM
*/

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public static void main(String[] args) {

    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i)) && !tMap.containsKey(t.charAt(i))) {
                sMap.put(s.charAt(i), t.charAt(i));
                tMap.put(t.charAt(i), s.charAt(i));
                continue;
            }
            if (sMap.get(s.charAt(i)) == t.charAt(i) && tMap.get(t.charAt(i)) == s.charAt(i)) {
                if (sMap.get(i) == t.charAt(i) && tMap.get(i) == s.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            }
            if (sMap.containsKey(s.charAt(i)) || tMap.containsKey(t.charAt(i)))
                return false;
        }
        return true;
    }
}
