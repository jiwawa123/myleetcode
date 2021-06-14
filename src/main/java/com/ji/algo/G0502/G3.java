package com.ji.algo.G0502;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2021/5/3
 * time 12:16 上午
 */
public class G3 {
    public static void main(String[] args) {
        System.out.println(longestBeautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu"));
    }

    static Map<Character, Character> map = new HashMap<>();
    public static int longestBeautifulSubstring(String word) {
        int res = 0;
        int len = 1;
        int index = word.indexOf('a');
        map.put('e','a');
        map.put('i','e');
        map.put('o','i');
        map.put('u','o');
        for (int i = index + 1; i < word.length(); i++) {
            if (len > 0 && isTrue(word.charAt(i), word.charAt(i - 1))) {
                len++;
                if (word.charAt(i) == 'u')
                    res = Math.max(res, len);
            } else {
                if (word.charAt(i) == 'a') {
                    len = 1;
                } else {
                    len = 0;
                }
            }
        }

        return res;
    }

    public static boolean isTrue(char a, char b) {
        return a == b || map.getOrDefault(a, ' ') == b;
    }
}
