package com.ji.algo.L551_600;/*
    user ji
    data 2019/5/27
    time 10:16 AM
*/

import java.util.*;

public class FindRestaurant {
    public static void main(String[] args) {

    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                if (i + map.get(list2[i]) < sum) {
                    sum = i + map.get(list2[i]);
                    res = new LinkedList<>();
                    res.add(list2[i]);
                }
                if (i + map.get(list2[i]) == sum) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
