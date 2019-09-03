package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/9/3
    time 8:15 AM
*/

public class FixedPoint {
    public static void main(String[] args) {

    }

    public int fixedPoint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i)
                return i;
        }
        return -1;
    }
}
