package com.ji.algo.L2401_2450;

/**
 * @Author: Bei Chang
 * @Date: 2022/10/23/下午6:52
 */
public class L2432 {
    public static void main(String[] args) {

    }

    public int hardestWorker(int n, int[][] logs) {
        int max = n + 1;
        int min = 0;
        for (int i = 0; i < logs.length; i++) {
            if (i == 0) {
                max = logs[i][0];
                min = logs[i][1];
            } else {
                int cost = logs[i][1] - logs[i - 1][1];
                if (cost >= min) {
                    min = cost;
                    max = Math.min(max, logs[0][1]);
                }
            }
        }
        return max;
    }
}
