package com.ji.algo.L901_950;/*
    user ji
    data 2019/8/4
    time 10:43 AM
*/

import java.util.HashMap;
import java.util.Map;

public class TopVotedCandidate {

    int times[];
    int result[];
    Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, Integer> query = new HashMap<>();

    public TopVotedCandidate(int[] persons, int[] times) {
        this.times = times;
        result = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            map.put(persons[i], map.getOrDefault(persons[i], 0) + 1);
            if (i == 0) {
                result[i] = persons[i];
            } else {
                if (result[i - 1] == persons[i] || map.get(result[i - 1]) > map.get(persons[i])) {
                    result[i] = result[i - 1];
                    continue;
                }
                if (map.get(result[i - 1]) <= map.get(persons[i])) {
                    result[i] = persons[i];
                    continue;
                }
            }
            query.put(times[i], result[i]);
        }
    }

    public int q(int t) {
        if (query.containsKey(t))
            return query.get(t);
        int index = getIndex(times, t);
        query.put(t, result[index]);
        return result[index];
    }

    public int getIndex(int times[], int t) {
        int i = 0, j = times.length - 1;
        while (i < j) {
            int med = (j - i) / 2 + i;
            if (t == times[med])
                return med;
            if (t > times[med])
                i = med + 1;
            else
                j = med - 1;
        }
        if (times[i] > t)
            return i - 1;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 0, 1, 0};
        int times[] = {0, 5, 10, 15, 20, 25, 30};
        TopVotedCandidate top = new TopVotedCandidate(arr, times);
        System.out.println(top.q(3));
//        System.out.println(top.q(12));
//        System.out.println(top.q(25));
//        System.out.println(top.q(15));
//        System.out.println(top.q(24));
//        System.out.println(top.q(8));
    }
}
