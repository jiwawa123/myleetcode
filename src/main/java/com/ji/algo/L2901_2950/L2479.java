package com.ji.algo.L2901_2950;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/13/21:05
 */
public class L2479 {
    public static void main(String[] args) {

    }

    public int beautifulSubstrings(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char a : vowels
        ) {
            map.put(a, 1);
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int t = 0;
            for (int j = i; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    t++;
                }
                if ((j - i + 1) % 2 == 0 && t == (j - i + 1) / 2 && t * t % k == 0) {
                    res++;
                }
            }
        }
        return res;
    }
}
