package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/4
    time 10:32 AM
*/

public class KnightProbability {
    public static void main(String[] args) {
        System.out.println(my_knightProbability(3, 3, 0, 0));
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

            board[x][y][step] += nextStep(board, N, step - 1, x + direction[0], y + direction[1]) / 8;
        }
        return board[x][y][step];
    }

    public static double my_knightProbability(int N, int K, int r, int c) {
        if (K == 0)
            return 1;
        double sum = 0;
        double arr[][] = new double[N][N];
        arr[r][c] = 1;
        int step[][] = {{-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}};
        for (int i = 0; i < K; i++) {
            double tmp[][] = new double[N][N];
            sum = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[j][k] == 0)
                        continue;
                    for (int l = 0; l < 8; l++) {
                        int x = j + step[l][0];
                        int y = k + step[l][1];
                        if (x < 0 || x >= N || y < 0 || y >= N)
                            continue;
                        sum += 0.125 * arr[j][k];
                        tmp[x][y] += 0.125 * arr[j][k];
                    }
                }
            }
            arr = tmp;
        }

        return sum;
    }
}
