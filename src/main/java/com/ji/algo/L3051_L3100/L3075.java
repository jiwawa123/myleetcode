package com.ji.algo.L3051_L3100;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/04/15:28
 */
public class L3075 {
    public static void main(String[] args) {
        int[] arr = {12, 1, 42};
        System.out.println(maximumHappinessSum(arr, 3));
    }

    public static long maximumHappinessSum(int[] happiness, int k) {
        long res = 0;
        Arrays.sort(happiness);
        for (int i = happiness.length - 1, j = k; i >= 0 && j > 0; i--, j--) {
            if (happiness[i] - (k - j) <= 0) {
                break;
            }
            res += happiness[i] - (k - j);
        }
        return res;
    }

}
