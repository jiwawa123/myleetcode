package com.ji.algo.L1251_1300;/*
    user ji
    data 2019/12/21
    time 11:39 AM
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RemoveCoveredIntervals {
    public static void main(String[] args) {
        int arr[][]  = {{1,4},{2,3}};
        System.out.println(removeCoveredIntervals(arr));
    }

    public static int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        int count = 0;
        if (intervals.length <= 1)
            return intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(s>=start&&e<=end){
                count++;
            }else{
                end = Math.max(e,end);
                start = Math.max(s,start);
            }
        }
        return intervals.length - count ;
    }
}
