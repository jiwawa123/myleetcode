package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/26
    time 10:19 AM
*/

public class NumArrayII {
    int arr[];
    public NumArrayII(int[] nums) {
        arr = nums;
    }

    public void update(int i, int val) {
        arr[i] = val;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        while(i<=j){
            sum+=arr[i++];
        }
        return sum;
    }
}
