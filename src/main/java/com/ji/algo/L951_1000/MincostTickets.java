package com.ji.algo.L951_1000;/*
    user ji
    data 2019/8/3
    time 9:41 AM
*/

public class MincostTickets {
    public static void main(String[] args) {

    }

    public int mincostTickets(int[] days, int[] costs) {
        int last = days[days.length - 1];
        int arr[] = new int[last + 1];
        arr[0] = 0;
        int index = 0;
        for (int i = 1; i <= last; i++) {
            if (days[index] != i) {
                arr[i] = arr[i - 1];
                continue;
            }
            arr[i] = Math.min(Math.min(arr[Math.max(i - 1, 0)] + costs[0],
                    arr[Math.max(i - 7, 0)] + costs[1]), arr[Math.max(i - 30, 0)] + costs[2]);
            index++;
        }
        return arr[last];
    }
}
