package com.ji.algo.L901_950;/*
    user ji
    data 2019/7/23
    time 5:44 PM
*/

import java.util.*;

public class MinIncrement {
    public int minIncrementForUnique(int[] A) {
        if (A.length == 0) return 0;
        Arrays.sort(A);
        int N = A[0], cnt = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] <= N)
                cnt += N - A[i];
            else
                N = A[i];
            N++;
        }
        return cnt;
    }
}
