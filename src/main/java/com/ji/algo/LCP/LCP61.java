package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/17/18:03
 */
public class LCP61 {
    public static void main(String[] args) {

    }

    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int n = temperatureA.length;
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            int temp = temperatureA[i + 1] - temperatureA[i];
            if (temp > 0) {
                a[i] = 1;
            } else if (temp < 0) {
                a[i] = -1;
            } else {
                a[i] = 0;
            }

            temp = temperatureB[i + 1] - temperatureB[i];
            if (temp > 0) {
                b[i] = 1;
            } else if (temp < 0) {
                b[i] = -1;
            } else {
                b[i] = 0;
            }
        }
        int ans = 0;
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == b[i]) {
                ans++;
                max = Math.max(ans, max);
            } else {
                ans = 0;
            }
        }
        return max;
    }

}
