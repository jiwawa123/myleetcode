package com.ji.ready202309;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/07/20:50
 */
public class L73 {
    public static void main(String[] args) {

    }

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Set<Integer> setRow = new HashSet<>();
        Set<Integer> setCol = new HashSet<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (setCol.contains(j) || setRow.contains(i)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
