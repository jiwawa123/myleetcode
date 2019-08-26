package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/8/26
    time 8:16 AM
*/

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumSmallerByFrequency {
    public static void main(String[] args) {

    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int arr[] = new int[queries.length];
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            int tmp[] = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                tmp[words[i].charAt(i) - 'a'] += 1;
            }
            int max = Integer.MAX_VALUE;
            for (int j = 0; j < 26; j++) {
                if (tmp[j] == 0)
                    continue;
                if (tmp[j] != 0) {
                    max = tmp[j];
                    break;
                }
            }
            map.put(max, map.getOrDefault(max, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int tmp[] = new int[26];
            for (int j = 0; j < queries[i].length(); j++) {
                tmp[queries[i].charAt(i) - 'a'] += 1;
            }
            int max = 0;
            for (int j = 0; j < 26; j++) {
                if (tmp[j] == 0)
                    continue;
                if (tmp[j] != 0) {
                    max = tmp[j];
                    break;
                }
            }
            for (int k : map.keySet()
                    ) {
                if (max < k) {
                    arr[i] += map.get(k);
                }
            }
        }
        return arr;
    }
}
