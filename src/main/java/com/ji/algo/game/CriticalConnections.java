package com.ji.algo.game;/*
    user ji
    data 2019/9/15
    time 10:49 AM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CriticalConnections {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> t1 = new ArrayList<>();
        t1.add(0);
        t1.add(1);
        list.add(t1);
        List<Integer> t2 = new ArrayList<>();
        t2.add(1);
        t2.add(2);
        list.add(t2);
        List<Integer> t3 = new ArrayList<>();
        t3.add(2);
        t3.add(0);
        list.add(t3);
        List<Integer> t4 = new ArrayList<>();
        t4.add(1);
        t4.add(3);
        list.add(t4);
        criticalConnections(4, list);

    }

    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

        List<List<Integer>> list = new ArrayList<>();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for (int i = 0; i < connections.size(); i++) {
            int start = connections.get(i).get(0);
            int end = connections.get(i).get(1);
            arr[start] += 1;
            arr[end] += 1;
            if (arr[start] == 1) {
                arr1[start] = end;
            }
            if (arr[end] == 1) {
                arr1[end] = start;
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(i);
                tmp.add(arr1[i]);
                list.add(tmp);
            }
        }
        return list;
    }
}
