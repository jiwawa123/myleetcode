package com.ji.algo.L2301_2350;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/24/下午4:31
 */
public class L2325 {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    public static String decodeMessage(String key, String message) {
        Set<Character> set = new HashSet<>();
        int index = 0;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            if (index == 26) {
                break;
            }
            char a = key.charAt(i);
            if (a == ' ') {
                continue;
            }
            if (set.contains(a)) {
                continue;
            } else {
                map.put(a, (char) ('a' + index++));
                set.add(a);
            }
        }
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                sp.append(" ");
            } else {
                sp.append(map.get(c));
            }
        }
        return sp.toString();
    }
}
