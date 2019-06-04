package com.ji.algo.L551_600;/*
    user ji
    data 2019/6/4
    time 9:21 PM
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class DistributeCandies {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4, 5, 5, 1};
        //System.out.println(Arrays.toString(distributeCandies(arr)));
    }

    public static int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int index = 0;
        candies[index++] = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] != candies[i - 1]) {
                candies[index++] = candies[i];
            }
        }
        return index <= candies.length / 2 ? index : candies.length / 2;
    }
}
