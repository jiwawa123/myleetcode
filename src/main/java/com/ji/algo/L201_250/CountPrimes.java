package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/17
    time 8:59 PM
*/

public class CountPrimes {
    public static void main(String[] args) {

    }
    public int countPrimes(int n) {
        if (n <= 0) {
            return 0;
        }
        boolean[] isPrimes = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrimes[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (!isPrimes[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                isPrimes[j] = false;
            }
        }
        int result = 0;
        for (int i = 2; i < n; i++) {
            result += isPrimes[i] ? 1 : 0;
        }
        return result;
    }
}
