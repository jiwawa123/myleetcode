package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/04/18:22
 */
public class L74 {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            int now = matrix[row][col];
            if (target == now) {
                return true;
            }
            if (target < now) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
