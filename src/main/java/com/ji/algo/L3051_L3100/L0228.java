package com.ji.algo.L3051_L3100;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/24/20:32
 */
public class L0228 {
    public static void main(String[] args) {

    }

    public int minOperations(int k) {
        int ans = Integer.MAX_VALUE;
        for (int m = 1; m <= k; m++) {
            ans = Math.min(ans, m - 1 + (k - 1) / m);
        }
        return ans;
    }
}
