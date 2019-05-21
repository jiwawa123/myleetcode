package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/21
    time 10:18 AM
*/

import java.util.ArrayList;
import java.util.List;

public class LongOnes {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(longestOnes(arr,3));
    }

    public static int longestOnes(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                count++;
                res = Math.max(res, count);
            } else {
                if (K == 0) {
                    count = 0;
                    continue;
                }
                if (list.size() < K) {
                    count++;
                    list.add(i);
                    res = Math.max(res, count);
                } else {

                    count = i - list.get(0);
                    res = Math.max(res, count);
                    list.remove(0);
                    list.add(i);
                }
            }
        }
        return res;
    }
}
