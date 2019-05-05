package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/5
    time 8:53 PM
*/

import java.util.*;

public class EraseOverlapIntervals {
    public static void main(String[] args) {

    }

    public int eraseOverlapIntervals(int[][] intervals) {
        int ret=0;
        if(0 == intervals.length || 0 == intervals[0].length)return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });

        int b=intervals[0][1];
        for (int i = 1; i <intervals.length ; i++) {
            if(intervals[i][1]<b){b=intervals[i][1];ret++;}
            else if(intervals[i][0]<b)ret++;
            else b=intervals[i][1];

        }
        return ret;

    }
}
