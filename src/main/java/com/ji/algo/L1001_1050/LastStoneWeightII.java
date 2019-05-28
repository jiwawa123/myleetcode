package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/28
    time 8:48 AM
*/

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LastStoneWeightII {
    public static void main(String[] args) {
        int arr[] = {2,7,4,1,8,1};
        lastStoneWeightII(arr);
    }

    public static int lastStoneWeightII(int[] stones) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < stones.length; i++) {
            list.add(stones[i]);
        }
        return help(list);
    }

    public static int help(List<Integer> list) {
        if (list.size() == 1)
            return list.get(0);
        if (list.size() == 0)
            return 0;
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        int arr[] = new int[2];
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) < min) {
                min = list.get(i) - list.get(i - 1);
                arr[0] = i - 1;
                arr[1] = i;
            }
        }
        list.remove(arr[1]);
        list.remove(arr[0]);
        if (min != 0)
            list.add(min);
        return help(list);
    }
}
