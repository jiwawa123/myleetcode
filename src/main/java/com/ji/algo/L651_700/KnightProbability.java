package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/4
    time 10:32 AM
*/

public class KnightProbability {
    public static void main(String[] args) {
        //System.out.println(knightProbability(3, 2, 0, 0));
    }

    final int[][] directions = new int[][]{{1, 2}, {-1, 2}, {1, -2}, {-1, -2}, {2, 1}, {-2, 1}, {2, -1}, {-2, -1},};

    public double knightProbability(int N, int K, int r, int c) {
        double[][][] board = new double[N][N][K + 1];
        return nextStep(board, N, K, r, c);
    }

    private double nextStep(double[][][] board, int N, int step, int x, int y) {
        if (x >= N || y >= N || x < 0 || y < 0) {
            return 0;
        }

        if (step == 0) {
            return 1.0d;
        }
        if (board[x][y][step] != 0) {
            return board[x][y][step];
        }
        for (int[] direction : directions) {

            board[x][y][step] += nextStep(board, N, step - 1, x + direction[0], y + direction[1])/8;
        }
        return board[x][y][step];
    }
}
