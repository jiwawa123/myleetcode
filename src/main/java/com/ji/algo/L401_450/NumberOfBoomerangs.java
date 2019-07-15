package com.ji.algo.L401_450;/*
    user ji
    data 2019/7/15
    time 9:35 AM
*/

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {
    public static void main(String[] args) {
        int[][] arr = {{0, 0}, {1, 0}, {2, 0}};
        System.out.println(numberOfBoomerangs(arr));
    }

    public static int numberOfBoomerangs(int[][] points) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> tmp = map.getOrDefault(i, new HashMap<>());
            for (int j = i + 1; j < points.length; j++) {
                Map<Integer, Integer> local = map.getOrDefault(j, new HashMap<>());
                int distance = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) +
                        (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                local.put(distance, local.getOrDefault(distance, 0) + 1);
                map.put(j, local);
                tmp.put(distance, tmp.getOrDefault(distance, 0) + 1);
            }
            map.put(i, tmp);
        }
        int count = 0;
        for (Map<Integer, Integer> tmp : map.values()
                ) {
            for (int t : tmp.values()
                    ) {
                count += (t - 1) * t;
            }
        }
        return count;
    }
}
