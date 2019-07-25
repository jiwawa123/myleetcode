package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/7/25
    time 3:09 PM
*/

public class CarPooling {
    public static void main(String[] args) {

    }

    public boolean carPooling(int[][] trips, int capacity) {
        int arr[] = new int[10001];
        for (int i = 0; i < trips.length; i++) {
            for (int j = trips[i][1]; j <= trips[i][2]; j++) {
                arr[j] += trips[i][0];
                if (arr[j] > capacity)
                    return false;
            }
        }
        return true;
    }
}
