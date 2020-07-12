package com.ji.algo.G0628;

/**
 * user ji
 * data 2020/6/28
 * time 9:00 上午
 */
public class L5433 {
    public static void main(String[] args) {

    }

    public int kthFactor(int n, int k) {
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                index++;
            }
            if (index == k)
                return i;
        }
        return -1;
    }
}
