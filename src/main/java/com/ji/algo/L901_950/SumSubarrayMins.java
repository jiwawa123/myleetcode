package com.ji.algo.L901_950;/*
    user ji
    data 2019/6/28
    time 10:09 PM
*/

import java.util.ArrayList;
import java.util.List;

public class SumSubarrayMins {
    public static void main(String[] args) {
        int arr[] ={3,1,2,4};
        new SumSubarrayMins().sumSubarrayMins(arr);
    }
    public int sumSubarrayMins(int[] A) {
        long res = 0;
        long mod = 1000000007;
        for (int i = 0; i<A.length; i++) {
            int l = i-1;
            for (; l>=0 && A[i] < A[l]; l--) ;
            int r = i+1;
            for (; r<A.length && A[i] <= A[r]; r++) ;

            res += (i-l)*(r-i)*A[i];
        }
        return (int)(res % mod);
    }

}
