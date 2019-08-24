package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/23
    time 10:49 PM
*/

import java.util.Arrays;
import java.util.Comparator;

public class MinRefuelStops {
    public static void main(String[] args) {
        int arr[][] = {{40, 50}};
        System.out.println(minRefuelStops(100, 50, arr));
    }

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        if (target <= startFuel)
            return 0;
        int longest = startFuel;
        int step = 0;
        int next = startFuel;
        Arrays.sort(stations, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < stations.length; i++) {

        }
        return step;
    }
}
