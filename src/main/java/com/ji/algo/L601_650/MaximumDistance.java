package com.ji.algo.L601_650;/*
    user ji
    data 2019/9/2
    time 6:40 PM
*/

public class MaximumDistance {
    public static void main(String[] args) {

    }

    public int getMaxDistance(int arr[][]) {
        int distance = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i][0],min);
            max = Math.max(arr[i][arr[i].length-1],max);
            distance = Math.max(distance,max - min);
        }
        return distance;
    }
}
