package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/24
    time 8:07 PM
*/

import java.util.HashMap;
import java.util.Map;

public class ReverseVowels {
    public static void main(String[] args) {

    }

    public String reverseVowels(String s) {
        char[] tmp = s.toCharArray();
        char[] aeiou = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        Map<Character, Integer> map = new HashMap<>();
        for (char a : aeiou
                ) {
            map.put(a, 1);
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (map.containsKey(tmp[i]) && map.containsKey(tmp[j])) {
                char z = tmp[i];
                tmp[i] = tmp[j];
                tmp[j] = z;
                i++;
                j--;
                continue;
            }
            if (!map.containsKey(tmp[i]) && !map.containsKey(tmp[j])) {
                i++;
                j--;
                continue;
            }
            if (!map.containsKey(tmp[i])) {
                i++;
            }
            if (!map.containsKey(tmp[j])) {
                j--;
            }
        }
        return String.valueOf(tmp);
    }
}
