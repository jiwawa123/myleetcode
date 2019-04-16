package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 8:15 PM
*/

public class TrailingZeroes {
    public static void main(String[] args) {

    }

    public int trailingZeroes(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n / 5;
            n /= 5;
        }
        return sum;
    }
}
