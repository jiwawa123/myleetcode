package com.ji.algo.L601_650;/*
    user ji
    data 2019/5/10
    time 3:03 PM
*/

public class FindMaxAverage {
    public static void main(String[] args) {

    }

    public double findMaxAverage(int[] nums, int k) {
        double sum = Integer.MIN_VALUE;
        double tmp = 0.0;
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                tmp += nums[i];
            }else{
                sum = Math.max(sum,tmp/k);
                tmp -= nums[i-k];
                tmp+=nums[i];
            }
        }
        sum = Math.max(sum,tmp/k);
        return sum;
    }
}
