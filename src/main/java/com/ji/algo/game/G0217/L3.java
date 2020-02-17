package com.ji.algo.game.G0217;/*
    user ji
    data 2020/2/17
    time 6:06 PM
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class L3 {
    public static void main(String[] args) {
        int[][] events = {{1, 2}, {1, 2}, {1, 5}, {1, 5}, {3, 3}};
        System.out.println(maxEvents(events));
    }

    public static int maxEvents(int[][] events) {
        int count = 0;
        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < events.length; i++) {
            int start = events[i][0];
            int end = events[i][1];
            for (int j = start; j <= end; j++) {
                if (!map.containsKey(j)) {
                    map.put(j, 1);
                    count++;
                    break;
                }
            }
        }

        return count >= events.length ? events.length : count;
    }
}
