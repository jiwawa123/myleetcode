package com.ji.algo.L451_500;/*
    user ji
    data 2019/7/16
    time 2:20 PM
*/

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {
    public static void main(String[] args) {

    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                int sum = A[i]+B[j];
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        for(int k = 0; k < C.length; k++){
            for(int m = 0; m < D.length; m++){
                int sum = 0 - C[k] - D[m];
                count += map.getOrDefault(sum, 0);
            }
        }
        return count;
    }
}
