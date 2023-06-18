package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/11/15:59
 */
public class LO038 {
    public static void main(String[] args) {

    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            res[i] = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }
}
