package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/9/3
    time 10:40 AM
*/

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {
    public static void main(String[] args) {

    }

    public int largestUniqueNumber(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1)
                continue;
            res = Math.max(res, arr[i]);
        }
        return res;
    }
}
