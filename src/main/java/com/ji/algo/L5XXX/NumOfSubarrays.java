package com.ji.algo.L5XXX;/*
    user ji
    data 2020/2/10
    time 3:32 PM
*/

public class NumOfSubarrays {
    public static void main(String[] args) {

    }

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        int[] prefixSum = new int[arr.length + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        for (int i = 0; i + k <= arr.length; i++) {
            if ((prefixSum[i + k] - prefixSum[i]) / k >= threshold) {
                res++;
            }
        }
        return res;
    }
}
