package com.ji.algo.L1101_1150;

/**
 * user ji
 * data 2021/1/26
 * time 3:30 下午
 */
public class L1128 {
    public static void main(String[] args) {

    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int arr[][] = new int[10][10];
        int count = 0;

        for (int i = 0; i < dominoes.length; i++) {
            int min = Math.min(dominoes[i][0], dominoes[i][1]);
            int max = Math.max(dominoes[i][0], dominoes[i][1]);
            arr[min][max] += 1;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 9; j >= i; j--) {
                count += arr[i][j];
            }
        }
        return count;
    }
}
