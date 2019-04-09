package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 10:49 AM
*/

public class MaxSubArray {
    public static void main(String[] args) {

    }
    //求最大子序列的和，如何前面的数的和加起来小于自身就不想加，否则开始相加
    public int maxSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            if(tmp+array[i]<array[i]){
                tmp = array[i];
            }else{
                tmp+=array[i];
            }
            max = Math.max(max,tmp);

        }
        return max;
    }
}
