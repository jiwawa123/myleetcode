package com.ji.algo.game;/*
    user ji
    data 2019/9/24
    time 2:02 PM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABS {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min) {
                List<Integer> res = new ArrayList<>();
                res.add(arr[i - 1]);
                res.add(arr[i]);
                list.add(res);
            }
        }
        return list;
    }
}
