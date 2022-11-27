package com.ji.algo.L2451_2500;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/27/下午10:46
 */
public class L6277 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1}, {1, 0, 1}, {0, 0, 1}};
        onesMinusZeros(arr);
    }

    public static int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] rows = new int[row];
        int[] cols = new int[col];
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += grid[i][j];
            }
            rows[i] = sum;
        }

        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum += grid[j][i];
            }
            cols[i] = sum;
        }
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = rows[i] + cols[j] - (row - rows[i]) - (col - cols[j]);
            }
        }
        return res;
    }
}
