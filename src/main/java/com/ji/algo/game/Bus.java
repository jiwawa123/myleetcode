package com.ji.algo.game;/*
    user ji
    data 2019/9/8
    time 10:30 AM
*/

public class Bus {
    public static void main(String[] args) {

    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start == destination)
            return 0;
        int min = Integer.MAX_VALUE;
        if (start > destination) {
            int tmp = start;
            start = destination;
            destination = tmp;
        }
        int count = 0;
        for (int i = start; i <= destination; i++) {
            count += distance[i];
        }
        min = Math.min(count,min);
        count = 0;
        for (int i = destination; i <distance.length; i++) {
            count+=distance[i];
        }
        for (int i = 0; i <start ; i++) {
            count+=distance[i];
        }
        min = Math.min(count,min);
        return min;
    }
}
