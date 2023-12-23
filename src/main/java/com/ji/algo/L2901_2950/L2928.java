package com.ji.algo.L2901_2950;

/**
 * @Author: Bei Chang
 * @Date: 2023/11/26/13:11
 */
public class L2928 {
    public static void main(String[] args) {

    }

    public int distributeCandies(int n, int limit) {
        int res = 0;
        for (int i = 0; i <= limit; i++) {
            int l = i;
            for (int j = 0; j <= limit; j++) {
                int t = j;
                for (int k = 0; k <= limit; k++) {
                    if (l <= limit && t <= limit && k <= limit) {
                        if (l + t + k == n) {
                            res++;
                        }
                    }
                }
            }
        }

        return res;
    }
}
