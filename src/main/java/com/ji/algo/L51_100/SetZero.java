package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 5:19 PM
*/

public class SetZero {
    public static void main(String[] args) {

    }
    //使用两个表示列来表示行和列是否为0
    //在时间复杂度上面可以近似的看做O^2,空间上可以看做使用了简单的常量空间
    public void setZeroes(int[][] matrix) {
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(row[i]==1||col[j]==0)
                    matrix[i][j] = 0;
            }
        }

    }
}
