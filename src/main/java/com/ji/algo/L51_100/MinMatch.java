package com.ji.algo.L51_100;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * user ji
 * data 2020/5/23
 * time 3:19 下午
 */
public class MinMatch {
    public static void main(String[] args) {
        String S = "ADOBECODEBANC", T = "ABC";
        System.out.println(minWindow(S, T));
    }

    public static String minWindow(String s, String t) {
        String res = "";
        Map<Character, Integer> tMap = new HashMap<>();
        for (char ct : t.toCharArray()
        ) {
            tMap.put(ct, tMap.getOrDefault(ct, 0) + 1);
        }
        char cs[] = s.toCharArray();
        int len = Integer.MAX_VALUE;
        Map<Character, Integer> sMap = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0, j = 0; i < cs.length; i++) {
            if (tMap.containsKey(cs[i])) {
                sMap.put(cs[i], sMap.getOrDefault(cs[i], 0) + 1);
                if (sMap.get(cs[i]) >= tMap.get(cs[i])) {
                    set.add(cs[i]);
                }
                if (set.size() == tMap.size()) {
                    while (j <= i) {
                        if (!tMap.containsKey(cs[j])) {
                            j++;
                            continue;
                        }
                        if (sMap.get(cs[j]) > tMap.get(cs[j])) {
                            sMap.put(cs[j], sMap.get(cs[j]) - 1);
                            j++;
                            continue;
                        }
                        break;
                    }
                    if (i - j + 1 < len) {
                        res = s.substring(j, i + 1);
                        len = i - j + 1;
                    }
                }
            }
        }
        return res;
    }
}
