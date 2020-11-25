package com.ji.algo.L401_450;

import java.util.Arrays;
import java.util.Comparator;

/**
 * user ji
 * data 2020/11/23
 * time 9:37 上午
 */
public class L452 {
    public static void main(String[] args) {
        int arr[][] = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
        System.out.println(findMinArrowShots(arr));
    }

    public static int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0)
            return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    if (o1[1] <= o2[1])
                        return -1;
                    else
                        return 1;
                if (o1[0] < o2[0])
                    return -1;
                return 1;
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
