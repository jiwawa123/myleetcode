package com.ji.algo.L751_800;/*
    user ji
    data 2019/5/16
    time 4:36 PM
*/

public class NumberOfArange {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        return numSubarrayBoundedMax(A, R) - numSubarrayBoundedMax(A, L - 1);
    }

    private int numSubarrayBoundedMax(int[] A, int Max) {
        int res = 0;
        int numSubarry = 0;
        for (int num : A) {
            if (num <= Max) {
                numSubarry++;
                res += numSubarry;
            } else {
                numSubarry = 0;
            }
        }
        return res;
    }
}
