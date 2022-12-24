package com.ji.algo.L2401_2450;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/12/24/下午5:54
 */
public class L2423 {
    public static void main(String[] args) {
        System.out.println(equalFrequency("ddaccb"));
    }

    public static boolean equalFrequency(String word) {
        int[] res = new int[26];
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            res[index] += 1;
            max = Math.max(max, res[index]);
        }
        if (max == 1 || max == word.length()) {
            return true;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int other = 0;
        for (int i = 0; i < 26; i++) {
            if (res[i] == 0) {
                continue;
            }

            if (res[i] != max) {
                other = res[i];
            }
            map.put(res[i], map.getOrDefault(res[i], 0) + 1);
            if (map.keySet().size() > 2) {
                return false;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == max) {
                if (other == max - 1 && entry.getValue() == 1) {
                    return true;
                }
            }

            if (entry.getKey() == 1 && entry.getValue() == 1) {
                return true;
            }
        }
        return false;
    }
}
