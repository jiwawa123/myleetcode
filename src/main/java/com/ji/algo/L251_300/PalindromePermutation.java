package com.ji.algo.L251_300;/*
    user ji
    data 2019/8/30
    time 12:44 PM
*/

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args) {

    }

    public boolean ifPalindrome(String code) {
        if (code == null || code.length() < 2)
            return true;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < code.length(); i++) {
            if (map.containsKey(code.charAt(i))) {
                map.remove(code.charAt(i));
            } else {
                map.put(code.charAt(i), 1);
            }
        }
        return map.size() < 2;
    }
}
