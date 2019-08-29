package com.ji.algo.L251_300;/*
    user ji
    data 2019/8/29
    time 11:07 PM
*/

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {
    public static void main(String[] args) {

    }

    public boolean AttendRoomNumber(int arr[][]) {
        if (arr == null || arr.length < 2)
            return true;
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[1];
            }
        });
        int end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (end >= arr[i][0]) {
                return false;
            } else {
                end = arr[i][1];
            }
        }
        return true;
    }
}
