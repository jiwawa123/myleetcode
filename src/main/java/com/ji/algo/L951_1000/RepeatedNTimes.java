package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/20
    time 12:12 PM
*/

import java.util.HashMap;
import java.util.Map;

public class RepeatedNTimes {
    public static void main(String[] args) {

    }

    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i]))
                return A[i];
            map.put(A[i], 0);
        }
        return A[0];
    }

    public int repeatedNTimesII(int[] A) {
        if(A[0]==A[2]) return A[0];
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1])
                return A[i];
        }
        if(A[1]==A[3]) return A[1];
        return A[0];
    }
}
