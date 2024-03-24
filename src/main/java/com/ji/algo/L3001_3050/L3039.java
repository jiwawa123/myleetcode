package com.ji.algo.L3001_3050;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/24/20:46
 */
public class L3039 {
    public static void main(String[] args) {

    }


    public String lastNonEmptyString(String s) {
        int max = 0;
        int[] arr = new int[26];
        StringBuilder sp = new StringBuilder();
        for (char c : s.toCharArray()) {
            arr[c - 'a'] += 1;
            max = Math.max(arr[c - 'a'], max);
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                set.add((char) ('a' + i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                arr[s.charAt(i) - 'a']--;
                if (arr[s.charAt(i) - 'a'] == 0) {
                    sp.append(s.charAt(i));
                }
            }
        }
        return sp.toString();
    }
}
