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
        int arr[] = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(arr));
    }

    public static int lastStoneWeight(int[] stones) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < stones.length; i++) {
            list.add(stones[i]);
        }
        Collections.sort(list);
        return help(list);
    }

    public static int help(List<Integer> list) {
        if (list.size() == 0)
            return 0;
        if (list.size() == 1)
            return list.get(0);
        int x = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        int y = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        int tmp = x - y;
        if (tmp == 0) {
            return help(list);
        } else {
            helpI(list, tmp);
            return help(list);
        }
    }

    public static void help(List<Integer> list, int tmp) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) > tmp)
                break;
            i++;
        }
        list.add(i, tmp);
    }

    public static void helpI(List<Integer> list, int tmp) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int med = (j - i) / 2 + i;
            if (list.get(med) == tmp) {
                i = med;
                break;
            } else if (list.get(med) > tmp) {
                j = med - 1;
            } else {
                i = med + 1;
            }
        }


        if (i<list.size()&&list.get(i) < tmp)
            i += 1;
        list.add(i, tmp);
    }
}
