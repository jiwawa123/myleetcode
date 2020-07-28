package com.ji.algo.G0725;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/7/25
 * time 10:17 下午
 */
public class G3 {
    public static void main(String[] args) {
        System.out.println(numSplits("abcd"));
    }

    public static int numSplits(String s) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i) - 'a', map.getOrDefault(s.charAt(i) - 'a', 0) + 1);
        }
        Map<Integer, Integer> left = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (left.size() == map.size()) {
                res++;
            }
            left.put(s.charAt(i) - 'a', left.getOrDefault(s.charAt(i) - 'a', 0) + 1);
            if (map.getOrDefault(s.charAt(i) - 'a', 0) == 1) {
                map.remove(s.charAt(i) - 'a');
            } else {
                map.put(s.charAt(i) - 'a', map.get(s.charAt(i) - 'a') - 1);
            }
        }
        return res;
    }
}
