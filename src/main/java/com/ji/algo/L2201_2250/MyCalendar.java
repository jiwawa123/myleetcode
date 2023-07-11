package com.ji.algo.L2201_2250;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/01/13:24
 */
public class MyCalendar {

    List<int[]> list = new ArrayList<>();

    public MyCalendar() {

    }

    public boolean book(int start, int end) {
        int[] arr = {start, end};
        if (list.size() == 0) {
            list.add(arr);
            return true;
        }
        int index = getIndex(start);
        if (index >= list.size()) {
            int[] tmp = list.get(index - 1);
            if (tmp[1] <= start) {
                list.add(index, arr);
                return true;
            }
            return false;

        }

        if (index == 0) {
            int[] tmp = list.get(index);
            if (end <= tmp[0]) {
                list.add(index, arr);
                return true;
            }
            return false;
        }
        int[] tmp = list.get(index);
        if (tmp[1] <= end) {
            return false;
        }

        int[] pre = list.get(index - 1);
        if (start < pre[1]) {
            return false;
        }

        int[] next = list.get(index);
        if (next[0] < end) {
            return false;
        }

        list.add(index, arr);

        return true;

    }

    public int getIndex(int start) {
        int l = 0, r = list.size() - 1;
        while (l <= r) {
            int med = (l + r) / 2;
            int[] arr = list.get(med);

            if (arr[0] == start) {
                return med;

            } else if (arr[0] < start) {
                l = med + 1;
            } else {
                r = med - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        MyCalendar calendar = new MyCalendar();
        calendar.book(37, 50);
        calendar.book(33, 50);
        calendar.book(4, 17);
        calendar.book(35, 48);
        calendar.book(8, 25);
    }
}
