package com.ji.algo.L701_750;/*
    user ji
    data 2019/6/25
    time 9:28 PM
*/

import java.util.HashMap;
import java.util.Map;

public class MyCalendar {
    public static void main(String[] args) {
        MyCalendar my = new MyCalendar();
        my.book(37, 50);
        my.book(33, 50);
        my.book(35, 48);
    }

    Map<Integer, Integer> map = new HashMap<>();

    public MyCalendar() {

    }

    public boolean book(int start, int end) {
        if (map.isEmpty()) {
            map.put(start, end);
            return true;
        }
        for (int sta : map.keySet()) {
            if (sta <= start && start < map.get(sta)) {
                return false;
            }
            if (end > sta && end < map.get(sta))
                return false;
            if (sta > start && end >= map.get(sta))
                return false;
        }
        map.put(start, end);
        return true;
    }
}
