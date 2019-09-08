package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/9/8
    time 10:13 AM
*/

public class TwoSumLessK {
    public static void main(String[] args) {

    }

    public int maxSum(int arr[], int k) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] < k) {
                    res = Math.max(res, arr[i] + arr[j]);
                }
            }
        }
        return res;
    }
}
