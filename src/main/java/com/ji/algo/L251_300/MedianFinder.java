package com.ji.algo.L251_300;/*
    user ji
    data 2019/8/4
    time 9:54 AM
*/

import java.util.ArrayList;
import java.util.List;

public class MedianFinder {
    List<Integer> list;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        list = new ArrayList();
    }

    public void addNum(int num) {
        int t = getIndex(list, num);
        list.add(t, num);
    }

    public double findMedian() {

        if (list.size() % 2 == 0) {
            int f = list.get(list.size() / 2);
            int s = list.get(list.size() / 2 - 1);
            return 1.0 * (f + s) / 2;
        } else {
            return list.get(list.size() / 2) * 1.0;
        }

    }

    public int getIndex(List<Integer> list, int n) {
        if (list.size() == 0)
            return 0;
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int med = (j - i) / 2 + i;
            if (list.get(med) == n) {
                return med;
            } else if (list.get(med) < n) {
                i = med + 1;
            } else {
                j = med - 1;
            }
        }
        if (list.get(i) < n)
            return i + 1;
        return i;
    }

    public static void main(String[] args) {
        MedianFinder md = new MedianFinder();
        md.addNum(1);
        md.addNum(2);
        System.out.println(md.findMedian());
        md.addNum(3);
        System.out.println(md.findMedian());
    }
}
