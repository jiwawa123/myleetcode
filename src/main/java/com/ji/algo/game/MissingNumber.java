package com.ji.algo.game;/*
    user ji
    data 2019/10/20
    time 8:54 AM
*/

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {5, 7, 11, 13};
        System.out.println(missingNumber(arr));
    }
    //完全就是一个数学问题，等差数列找出中间缺失的那个即可
    public static int missingNumber(int[] arr) {
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }

        return (arr[0] + arr[len - 1]) * (len + 1) / 2 - sum;
    }
}
