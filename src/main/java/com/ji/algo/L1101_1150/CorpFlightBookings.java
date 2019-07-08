package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/8
    time 11:27 AM
*/

import java.util.Arrays;
import java.util.Map;

public class CorpFlightBookings {
    public static void main(String[] args) {
        System.out.println(String.format("this is %s", "test "));
    }

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int arr[] = new int[n + 1];
        for (int tmp[] : bookings
                ) {
            arr[tmp[0] - 1] += tmp[2];
            arr[tmp[1]] -= tmp[2];
        }
        for (int i = 1; i < n; ++i) {
            arr[i] += arr[i - 1];
        }

        return Arrays.copyOfRange(arr, 0, n);
    }
}
