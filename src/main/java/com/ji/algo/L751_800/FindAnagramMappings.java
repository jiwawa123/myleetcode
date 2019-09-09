package com.ji.algo.L751_800;/*
    user ji
    data 2019/9/9
    time 5:35 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagramMappings {
    public static void main(String[] args) {

    }

    public int[] findAnagramMapping(int arr[], int arr1[]) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            List<Integer> list = map.getOrDefault(arr1[i], new ArrayList<>());
            list.add(i);
            map.put(arr1[i], list);
        }
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]).remove(0);
        }
        return res;
    }
}
