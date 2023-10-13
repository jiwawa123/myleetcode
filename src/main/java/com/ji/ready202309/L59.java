package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/07/23:32
 */
public class L59 {
    public static void main(String[] args) {
        int[][] arr = generateMatrix(9);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int n) {
        int row = (int) Math.sqrt(n);
        int[][] res = new int[row][row];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int x = 0, y = 0;
        int d = 0;
        boolean[][] flag = new boolean[row][row];
        for (int i = 1; i <= n; i++) {
            res[x][y] = i;
            int a = x + dx[d];
            int b = y + dy[d];
            if (a < 0 || b < 0 || a >= row || b >= row || flag[a][b]) {
                d++;
                d %= 4;
            }
            flag[x][y] = true;
            x = x + dx[d];
            y = y + dy[d];
        }

        return res;
    }
}
