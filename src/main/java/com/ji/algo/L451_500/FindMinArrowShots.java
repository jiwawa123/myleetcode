package com.ji.algo.L451_500;/*
    user ji
    data 2019/8/25
    time 10:00 AM
*/

import java.util.Arrays;
import java.util.Comparator;

public class FindMinArrowShots {
    public static void main(String[] args) {
        int arr[][] = {{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}};
        findMinArrowShots(arr);
    }

    public static int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0)
            return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        int count = 1;
        int start = points[0][0];
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                start = points[i][0];
                end = points[i][1];
                count++;
                continue;
            } else {
                start = Math.max(start, points[i][0]);
                end = Math.min(end, points[i][1]);
            }
        }
        return count;
    }
}
