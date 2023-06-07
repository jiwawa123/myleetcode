package com.ji.algo.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/04/10:33
 */
public class LCP66 {
    public static void main(String[] args) {

    }

    public int minNumBooths(String[] demand) {
        int res = 0;
        int[] arr = new int[26];
        for (String de : demand
        ) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < de.length(); i++) {
                map.put(de.charAt(i), map.getOrDefault(de.charAt(i), 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()
            ) {
                int index = entry.getKey() - 'a';
                if (arr[index] < entry.getValue()) {
                    res += entry.getValue() - arr[index];
                    arr[index] = entry.getValue();
                }
            }
        }

        return res;
    }
}
