package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/6/14
    time 4:51 PM
*/

import java.util.HashMap;
import java.util.Map;

public class CountSong {
    public static void main(String[] args) {

    }

    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i] % 60 == 0) {
                count += map.getOrDefault(0, 0);
                map.put(0, map.getOrDefault(0, 0) + 1);
                continue;
            }
            count += map.getOrDefault(60 - time[i] % 60, 0);
            map.put(time[i] % 60, map.getOrDefault(time[i] % 60, 0) + 1);
        }
        return count;
    }
}
