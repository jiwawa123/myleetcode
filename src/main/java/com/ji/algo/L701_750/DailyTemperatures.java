package com.ji.algo.L701_750;/*
    user ji
    data 2019/6/7
    time 12:45 PM
*/

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int arr[] = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            for (int j = i+1; j < T.length; j++) {
                if(T[i]<T[j]){
                    arr[i] = j - i;
                    break;
                }
            }
        }
        return arr;
    }
}
