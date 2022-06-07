package com.ji.algo.L2201_2250;

/**
 * @Author: Bei Chang
 * @Date: 2022/06/02/下午10:50
 */
public class L2224 {
    public static void main(String[] args) {

    }

    public int convertTime(String current, String correct) {
        String[] hm1 = current.split(":");
        String[] hm2 = correct.split(":");
        int min = Integer.valueOf(hm1[0]) * 60 + Integer.valueOf(hm1[1]);
        int max = Integer.valueOf(hm2[0]) * 60 + Integer.valueOf(hm2[1]);
        int res = 0;
        while (max != min) {
            if (max - min >= 50) {
                max -= 50;
                res++;
                continue;
            }
            if (max - min >= 15) {
                max -= 15;
                res++;
                continue;
            }

            if (max - min >= 5) {
                max -= 5;
                res++;
                continue;
            }

            if (max - min >= 1) {
                max -= 1;
                res++;
                continue;
            }
        }
        return res;
    }
}
