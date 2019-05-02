package com.ji.algo.L301_350;/*
    user ji
    data 2019/5/2
    time 1:46 PM
*/

public class IntegerBreak {
    public static void main(String[] args) {
        System.out.println(integerBreak(8));
    }

    public static int integerBreak(int n) {
        if (n <= 2)
            return 1;
        int res[] = new int[n + 1];
        res[1] = res[2] = 1;
        for (int i = 3; i <= n; i++) {
            int max = 1;
            for (int j = i - 1; j >= 0; j--) {
                max = Math.max(max, res[j] * res[i - j]);
                max = Math.max(max,res[j]*(i-j));
                max = Math.max(max,j*(i-j));
            }
            res[i] = max;
        }
        return res[n];

    }
}
