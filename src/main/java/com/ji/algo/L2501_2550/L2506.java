package com.ji.algo.L2501_2550;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2022/12/21/上午9:02
 */
public class L2506 {
    public static void main(String[] args) {

    }

    public int similarPairs(String[] words) {
        int res = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sp = new StringBuilder();
            int[] arr = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                arr[words[i].charAt(j) - 'a'] += 1;
            }
            for (int j = 0; j < 26; j++) {
                if (arr[j] > 0) {
                    sp.append((char) ('a' + j));
                }
            }
            map.put(sp.toString(), map.getOrDefault(sp.toString(), 0) + 1);

        }
        for (int k : map.values()
        ) {
            if (k > 1) {
                res += (k * (k - 1)) / 2;
            }
        }
        return res;

    }
}
