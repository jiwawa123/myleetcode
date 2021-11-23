package com.ji.algo.L2001_2050;

import java.util.Arrays;

/**
 * @author ji
 * @data 2021/11/23
 * @time 10:24 下午
 */
public class L2037 {
    public static void main(String[] args) {

    }

    public int minMovesToSeat(int[] seats, int[] students) {
        int count = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            count += Math.abs(seats[i] - students[i]);

        }
        return count;
    }
}
