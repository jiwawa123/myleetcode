package com.ji.algo.L351_400;/*
    user ji
    data 2019/7/27
    time 3:41 PM
*/

public class CountNumbersWithUniqueDigits {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(2));
    }

    public static int countNumbersWithUniqueDigits(int n) {

        if (n <= 1)
            return (int) Math.pow(10, n);
        int count = 10;
        int start = 2;
        while (start <= n) {
            int all = 9;
            for (int i = 0; i < start - 1; i++) {
                all *= (9 - i);
            }
            count += all;
            start++;
        }
        return count;
    }
}
