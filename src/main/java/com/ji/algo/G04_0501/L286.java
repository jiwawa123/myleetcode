package com.ji.algo.G04_0501;

/**
 * @Author: Bei Chang
 * @Date: 2024/05/01/10:34
 */
public class L286 {
    public static void main(String[] args) {

    }

    public boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int t = 0;
                for (int k = i; k < i + 2; k++) {
                    for (int l = 0; l < j + 2; l++) {
                        if (grid[i][j] == 'B') {
                            t++;
                        }
                    }
                }
                if (t >= 3 || t <= 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
