package com.ji.algo.L401_450;/*
    user ji
    data 2019/7/16
    time 2:50 PM
*/

import java.util.*;

public class FindRightInterval {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(13);
        list.add(15);
        list.add(16);
        System.out.println(new FindRightInterval().getIndex(list,14));
    }
    public int[] findRightInterval(int[][] intervals) {
        int res[] = new int[intervals.length];
        Arrays.fill(res, -1);
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intervals.length; i++) {
            max = Math.max(max, intervals[i][0]);
            map.put(intervals[i][0], i);
            list.add(intervals[i][0]);
        }
        Collections.sort(list);
        for (int i = 0; i < intervals.length; i++) {
            int tmp = getIndex(list, intervals[i][1]);
            if (tmp != 1) {
                res[i] = map.get(list.get(tmp));
            }
        }
        return res;
    }

    public int getIndex(List<Integer> list, int num) {
        if (num > list.get(list.size() - 1))
            return -1;
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int med = (j - i) / 2+i;
            if (list.get(med) == num) {
                return med;
            } else if (list.get(med) > num) {
                j = med - 1;
            } else {
                i = med + 1;
            }
        }
        if(list.get(i)<num)
            return i+1;
        return i;
    }

}
