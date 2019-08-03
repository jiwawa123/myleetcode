package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/3
    time 6:49 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Insert {
    public static void main(String[] args) {

    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length <= 1)
            return intervals;
        List<int[]> list = new ArrayList();
        for (int arr[] : intervals
                ) {
            list.add(arr);
        }
        list.add(newInterval);
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        List<int[]> res = new ArrayList<>();
        int start = list.get(0)[0];
        int end = list.get(0)[1];
        for (int i = 1; i < list.size(); i++) {
            if(end<list.get(i)[0]){
                int t[] = {start,end};
                res.add(t);
                start = list.get(i)[0];
                end = list.get(i)[1];
                continue;
            }
            start = Math.min(start,list.get(i)[0]);
            end = Math.max(end,list.get(i)[1]);
        }
        int t[] = {start,end};
        res.add(t);
        int arr[][] = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}
