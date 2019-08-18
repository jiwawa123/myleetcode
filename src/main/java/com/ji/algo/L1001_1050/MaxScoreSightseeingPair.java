package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/8/18
    time 10:14 PM
*/

public class MaxScoreSightseeingPair {
    public static void main(String[] args) {

    }

    public int maxScoreSightseeingPair(int[] A) {
        int max = 0;
        int last = A[0];
        for (int i = 1; i < A.length; i++) {
            max = Math.max(last+A[i]-1,max);
            last = Math.max(A[i],last-1);
        }
        return max;
    }
}
