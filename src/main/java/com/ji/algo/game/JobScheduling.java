package com.ji.algo.game;/*
    user ji
    data 2019/10/20
    time 11:12 AM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobScheduling {
    public static void main(String[] args) {

    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<int[]> list = new ArrayList<>();
        int end = 0;
        for (int i = 0; i < startTime.length; i++) {
            int t[] = {startTime[i], endTime[i], profit[i]};
            list.add(t);
            end = Math.max(end, endTime[i]);
        }
        int res = 0;
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        return res;
    }
}
