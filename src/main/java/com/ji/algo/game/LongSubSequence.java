package com.ji.algo.game;/*
    user ji
    data 2019/10/6
    time 4:31 PM
*/

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LongSubSequence {
    public static void main(String[] args) {

    }

    public int longestSubsequence(int[] arr, int difference) {
        int len = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : arr
                ) {
            if (map.containsKey(k - difference)) {
                map.put(k, map.get(k - difference) + 1);
            } else {
                map.put(k, 1);
            }
            len = Math.max(map.get(k), len);
        }

        return len;
    }
}
