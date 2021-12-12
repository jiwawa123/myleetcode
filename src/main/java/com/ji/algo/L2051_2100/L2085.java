package com.ji.algo.L2051_2100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ji
 * @data 2021/12/8
 * @time 10:13 下午
 */
public class L2085 {
    public static void main(String[] args) {

    }

    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        for (String str : words1
        ) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (String str : words2
        ) {
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }
        for (String s : words1) {
            if (map.get(s) == 1 && map.getOrDefault(s, 0) == 1)
                count++;
        }
        return count;
    }
}
