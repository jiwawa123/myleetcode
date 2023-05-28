package com.ji.algo.L2601_2650;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/01/22:01
 */
public class L2643 {
    public static void main(String[] args) {

    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];
        int min = 0, len = 0;
        for (int i = 0; i < mat.length; i++) {
            int tmp = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    tmp++;
                }
            }
            if (tmp > len) {
                min = i;
                len = tmp;
            }
        }
        res[0] = min;
        res[1] = len;
        return res;
    }
}
