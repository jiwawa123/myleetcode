package com.ji.algo.L551_600;/*
    user ji
    data 2019/9/9
    time 5:07 PM
*/

import java.util.*;

public class KillProcess {
    public static void main(String[] args) {

    }

    Set<Integer> set = new HashSet<>();
    Map<Integer, List<Integer>> map = new HashMap<>();

    public List<Integer> killProcess(int arr[], int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i]))
                map.get(arr1[i]).add(arr[i]);
            else {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(arr1[i], list);
            }
        }
        return new ArrayList<>(set);
    }

    public void help(int start){
        if(set.contains(start))
            return;
        set.add(start);
        List<Integer> tmp = map.getOrDefault(start,new ArrayList<>());
        for (int i = 0; i < tmp.size(); i++) {
            help(tmp.get(i));
        }
    }
}
