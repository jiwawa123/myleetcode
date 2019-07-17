package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/17
    time 9:16 AM
*/

import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        List<Integer> sort1 = new ArrayList<>();
        List<Integer> sort2 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i]))
                sort1.add(arr1[i]);
            else
                sort2.add(arr1[i]);
        }
        Collections.sort(sort1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        Collections.sort(sort2);
        for (int i = 0; i < sort1.size(); i++) {
            arr1[i] = sort1.get(i);
        }
        for (int i = sort1.size(); i < arr1.length; i++) {
            arr1[i] = sort2.get(i - sort1.size());
        }
        return arr1;
    }
}
