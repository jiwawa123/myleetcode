package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/3
    time 9:41 PM
*/

import java.util.Arrays;

public class DistributeCandies {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(distributeCandies(90,4)));
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int index = 1;
        int len = 0;
        int res[] = new int[num_people];
        while (candies >= index) {
            res[len % num_people] += index;
            candies -= index++;
            len++;
        }
        res[len % num_people] += candies;
        return res;
    }
}
