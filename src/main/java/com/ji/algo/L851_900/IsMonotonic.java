package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/24
    time 10:57 PM
*/

public class IsMonotonic {
    public static void main(String[] args) {

    }

    public boolean isMonotonic(int[] A) {
        if (null == A || A.length < 2)
            return true;
        int increase = 0;
        int descreas = 0;
        for (int i = 1; i < A.length; i++) {
            if (increase > 0 && descreas > 0)
                return false;
            if (A[i] - A[i - 1] == 0)
                continue;
            if (A[i] - A[i - 1] < 0)
                descreas++;
            else
                increase++;
        }
        return increase == 0 || descreas == 0;
    }
}
