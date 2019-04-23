package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/23
    time 7:30 PM
*/

public class SearchMatrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (target == matrix[i][j])
                return true;
            else if (target > matrix[i][j])
                i++;
            else
                j--;
        }
        return false;
    }
}
