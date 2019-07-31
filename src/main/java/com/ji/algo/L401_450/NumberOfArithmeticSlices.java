package com.ji.algo.L401_450;/*
    user ji
    data 2019/7/31
    time 9:39 AM
*/


public class NumberOfArithmeticSlices {
    public static void main(String[] args) {

    }
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length <= 2)
            return 0;
        int res = 0;
        int add = 0;
        for (int i = 2; i < A.length; i++)
            if (A[i - 1] - A[i] == A[i - 2] - A[i - 1])
                res += ++add;
            else
                add = 0;
        return res;

    }
}
