package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/28
    time 8:35 AM
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LastStoneWeight {
    public static void main(String[] args) {

    }

    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < stones.length; i++) {
            list.add(stones[i]);
        }
        return help(list);
    }

    public int help(List<Integer> list) {
        if (list.size() == 1)
            return list.get(0);
        if (list.size() == 0)
            return 0;
        Collections.sort(list);
        int x = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        int y = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        int tmp = x - y;
        if (tmp == 0) {
            return help(list);
        } else {
            list.add(tmp);
            return help(list);
        }
    }
}
