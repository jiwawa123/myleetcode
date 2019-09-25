package com.ji.algo.L51_100;
/*
    user ji
    data 2019/9/25
    time 8:01 PM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L57 {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int tmp[] = {4, 8};
        int res[][] = insert(arr, tmp);
        for (int inter[] : res
                ) {
            System.out.println(Arrays.toString(inter));
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        for (int i = 0; i < intervals.length; i++) {
            int s1 = intervals[i][0];
            int s2 = intervals[i][1];
            if (s2 < start) {
                list.add(intervals[i]);
            } else {
                if (s1 > end) {
                    int tmp[] = {start, end};
                    list.add(tmp);
                    start = s1;
                    end = s2;
                    continue;
                }
                start = Math.min(start, s1);
                end = Math.max(end, s2);
            }
        }

        int[][] res = new int[list.size() + 1][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        int tmp[] = {start, end};
        res[list.size()] = tmp;
        return res;
    }
}
