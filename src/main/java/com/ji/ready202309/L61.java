package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/12/08:45
 */
public class L61 {
    public static void main(String[] args) {

    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length, col = obstacleGrid[0].length;
        int[] tmp = new int[col];
        for (int i = 0; i < row; i++) {
            int[] next = new int[col];
            for (int j = 0; j < col; j++) {
                if (obstacleGrid[i][j] == 0) {
                    if (i == 0 && j == 0) {
                        next[j] = 1;
                        continue;
                    }
                    if (i == 0) {
                        next[j] = next[j - 1];
                        continue;
                    }
                    if (j == 0) {
                        next[j] = tmp[j];
                        continue;
                    }

                    next[j] = next[j - 1] + tmp[j];
                }
            }
            tmp = next;
        }

        return tmp[col - 1];
    }
}
