package com.ji.algo.L2951_3000;

/**
 * @Author: Bei Chang
 * @Date: 2023/12/12/09:53
 */
public class L2960 {
    public static void main(String[] args) {

    }

    public int countTestedDevices(int[] batteryPercentages) {
        int res = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] == 0) {
                continue;
            }
            res++;
            for (int j = i + 1; j < batteryPercentages.length; j++) {
                batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
            }
        }
        return res;
    }
}
