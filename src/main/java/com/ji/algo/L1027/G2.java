package com.ji.algo.L1027;/*
    user ji
    data 2019/10/27
    time 10:38 AM
*/

import java.util.ArrayList;
import java.util.List;

public class G2 {
    public static void main(String[] args) {
        List<Integer> l = circularPermutation(3, 2);
        l.stream().forEach(System.out::println);
    }

    public static List<Integer> circularPermutation(int n, int start) {
        int tmp[] = new int[1 << n];
        for (int i = 0; i < 1 << n; i++) {
            tmp[i] = i ^ (i >> 1);
        }
        int index = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == start) {
                index = i;
                break;
            }
        }
        List<Integer> l = new ArrayList<>();
        for (int i = index; i < tmp.length; i++) {
            l.add(tmp[i]);
        }
        for (int i = 0; i < index; i++) {
            l.add(tmp[i]);
        }
        return l;
    }
}
