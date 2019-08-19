package com.ji.algo.L701_750;/*
    user ji
    data 2019/8/19
    time 10:44 AM
*/

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MyCalendarTwo {

    public static void main(String[] args) {
        MyCalendarTwo two = new MyCalendarTwo();
        two.book(10, 20);
        two.book(50, 60);
        two.book(10, 40);
        two.book(5, 15);
        two.book(5, 10);
        two.book(25, 55);
    }

    private TreeMap<Integer, Integer> calendar;

    public MyCalendarTwo() {
        calendar = new TreeMap<>();
    }
    public boolean book(int start, int end) {
        // 尝试添加至日程中
        calendar.put(start, calendar.getOrDefault(start, 0) + 1);
        calendar.put(end, calendar.getOrDefault(end, 0) - 1);
        // 记录活跃的日程数
        int active = 0;

        for (int d : calendar.values()) {
            // 以时间线统计日程
            active += d;

            // 中途活跃日程>=3时，返回 false
            if (active >= 3) {

                // 恢复现场
                calendar.put(start, calendar.get(start) - 1);
                calendar.put(end, calendar.get(end) + 1);

                // remove this part, it can passes. but this will only costs more spaces.
                if (calendar.get(start) == 0)
                    calendar.remove(start);

                return false;
            }
        }
        return true;

    }
}
