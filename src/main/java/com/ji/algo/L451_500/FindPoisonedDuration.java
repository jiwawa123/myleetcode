package com.ji.algo.L451_500;/*
    user ji
    data 2019/6/27
    time 6:37 PM
*/

public class FindPoisonedDuration {
    public static void main(String[] args) {
        int arr[] = {1, 4};
        System.out.println(findPoisonedDuration(arr, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (index <= timeSeries[i]) {
                count += duration;
                index = timeSeries[i] + duration;
            } else {
                count += timeSeries[i] + duration - index;
                index += timeSeries[i] + duration - index;
            }

        }
        return count;
    }
}
