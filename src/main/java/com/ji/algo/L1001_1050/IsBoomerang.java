package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/8
    time 8:11 PM
*/

public class IsBoomerang {
    public static void main(String[] args) {

    }

    public boolean isBoomerang(int[][] p) {
        return (p[0][0] * (p[1][1] - p[2][1]) + p[1][0] *
                (p[2][1] - p[0][1]) + p[2][0] * (p[0][1] - p[1][1])) != 0;
    }
}
