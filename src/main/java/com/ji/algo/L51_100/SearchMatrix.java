package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 5:26 PM
*/

public class SearchMatrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix[0].length - 1, j = 0;
        while (i >= 0 && j < matrix.length) {
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] < target) {
                j++;
            } else {
                i--;
            }

        }
        return false;
    }
}
