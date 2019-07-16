package com.ji.algo.L451_500;/*
    user ji
    data 2019/7/16
    time 1:27 PM
*/

import java.util.Arrays;

public class FindR {
    public static void main(String[] args) {

    }

    public int findRadius(int[] houses, int[] heaters) {
        int[] min = new int[houses.length];
        Arrays.fill(min, Integer.MAX_VALUE);
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int j = 0;
        for (int i = 0; i < houses.length; i++) {
            while (j < heaters.length - 1 && Math.abs(heaters[j] - houses[i]) >= Math.abs(heaters[j + 1] - houses[i]))
                j++;
            min[i] = Math.min(min[i], Math.abs(houses[i] - heaters[j]));
        }
        Arrays.sort(min);
        return min[min.length - 1];
    }
}
