package com.ji.algo.L2801_2850;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/11/20:56
 */
public class L2806 {
    public static void main(String[] args) {

    }

    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int m = purchaseAmount / 10;
        int t = purchaseAmount - m * 10;
        int t1 = (m + 1) * 10 - purchaseAmount;
        if (t < t1) {
            return 100 - m * 10;
        }
        return Math.max(0, 100 - (m + 1) * 10);

    }
}
