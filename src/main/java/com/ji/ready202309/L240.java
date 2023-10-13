package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/17:23
 */
public class L240 {

    public static void main(String[] args) {

    }


    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix.length - 1;
        while (i < matrix.length && j >= 0) {
            if(matrix[i][j]==target) {
                return true;
            }
            if (matrix[i][j] > target) {
                i--;
            }else{
                j++;
            }
        }

        return false;
    }
}
