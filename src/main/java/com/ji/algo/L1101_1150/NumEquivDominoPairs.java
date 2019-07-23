package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/23
    time 9:03 AM
*/

public class NumEquivDominoPairs {
    public static void main(String[] args) {

    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        int tmp[][] = new int[10][10];
        for (int i = 0; i < dominoes.length; i++) {
            if (dominoes[i][0] > dominoes[i][1])
                tmp[dominoes[i][1]][dominoes[i][0]] += 1;
            else
                tmp[dominoes[i][0]][dominoes[i][1]] += 1;
        }
        for (int i = 1; i < tmp.length; i++) {
            for (int j = 1; j < tmp[i].length; j++) {
                count += tmp[i][j] * (tmp[i][j]-1) / 2;
            }
        }
        return count;
    }
}
