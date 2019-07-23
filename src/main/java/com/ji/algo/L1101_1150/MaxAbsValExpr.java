package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/23
    time 9:56 AM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAbsValExpr {
    public static void main(String[] args) {

    }

    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max = 0;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            l1.add(arr1[i] + arr2[i] - i);
            l2.add(arr1[i] + arr2[i] + i);
            l3.add(arr1[i] - arr2[i] - i);
            l4.add(arr1[i] - arr2[i] + i);
        }
        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);
        Collections.sort(l4);
        max = Math.max(max, l1.get(arr1.length - 1) - l1.get(0));
        max = Math.max(max, l2.get(arr1.length - 1) - l2.get(0));
        max = Math.max(max, l3.get(arr1.length - 1) - l3.get(0));
        max = Math.max(max, l4.get(arr1.length - 1) - l4.get(0));
        return max;
    }
}
