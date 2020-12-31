package com.ji.algo.G1227;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/12/27
 * time 6:42 下午
 */
public class G3 {
    public static void main(String[] args) {

    }

    public boolean halvesAreAlike(String s) {
        int n = s.length() / 2;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] tmp = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char a : tmp
        ) {
            map.put(a, 1);
        }
        for (int i = 0; i < n; i++) {
            count += map.containsKey(s.charAt(i)) ? 1 : 0;
        }
        for (int i = n; i < 2 * n; i++) {
            count += map.containsKey(s.charAt(i)) ? -1 : 0;
        }
        return count == 0;
    }
}
