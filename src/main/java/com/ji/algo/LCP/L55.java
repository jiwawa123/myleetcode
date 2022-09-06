package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/03/下午10:03
 */
public class L55 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2};
        int[][] f = {{0, 2}, {1, 4}, {2, 1}};
        System.out.println(getMinimumTime(arr, f, 3));

    }

    public static int getMinimumTime(int[] time, int[][] fruits, int limit) {
        int res = 0;
        for (int i = 0; i < fruits.length; i++) {
            int m = (int) (Math.ceil(fruits[i][1] * 1.0 / limit));
            res += time[fruits[i][0]] * m;
        }
        return res;
    }
}
