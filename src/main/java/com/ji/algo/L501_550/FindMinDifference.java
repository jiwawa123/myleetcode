package com.ji.algo.L501_550;/*
    user ji
    data 2019/7/28
    time 4:18 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinDifference {
    public static void main(String[] args) {

    }

    public int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < timePoints.size(); i++) {
            String arr[] = timePoints.get(i).split(":");
            list.add(Integer.valueOf(arr[0]) * 60 + Integer.valueOf(arr[1]));
        }
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            min = Math.min(min, Math.abs(list.get(i) - list.get(i + 1)));
        }
        min = Math.min(min, 24 * 60 - Math.max(list.get(0), list.get(list.size() - 1)) + Math.min(list.get(0), list.get(list.size() - 1)));
        return min;
    }
}
