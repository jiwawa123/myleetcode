package com.ji.algo.G1019;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/10/19
 * time 10:26 上午
 */
public class L1624 {
    public static void main(String[] args) {

    }

    public int maxLengthBetweenEqualCharacters(String s) {
        boolean f = false;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                f = true;
                res = Math.max(res, i - 1 - map.get(s.charAt(i)));
            } else {
                map.put(s.charAt(i), i);
            }
        }

        if (f)
            return res;
        return -1;

    }
}
