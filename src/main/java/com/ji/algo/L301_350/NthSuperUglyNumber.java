package com.ji.algo.L301_350;/*
    user ji
    data 2019/7/27
    time 10:01 AM
*/

public class NthSuperUglyNumber {
    public static void main(String[] args) {

    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] idxs = new int[primes.length],
                dp = new int[n];//dp[i]由min{primes[j] * dp[idxs[j]]},j=[0,n)得到
        int i = 1;
        dp[0] = 1;
        while (i < n) {
            int j = 0, min = Integer.MAX_VALUE;
            for (int num : primes) {
                if (num * dp[idxs[j]] < min)
                    min = num * dp[idxs[j]];
                j++;
            }
            dp[i] = min;
            j = 0;
            for (int num : primes) {
                if (min == num * dp[idxs[j]])
                    idxs[j]++;
                j++;
            }
            i++;
        }
        return dp[n - 1];
    }
}
