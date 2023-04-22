package com.ji.algo.L2551_2600;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/05/18:59
 */
public class L2517 {
    public static void main(String[] args) {

    }

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < price.length - k; i++) {
            min = Math.min(price[i + k] - price[i], min);
        }

        return min;
    }
}
