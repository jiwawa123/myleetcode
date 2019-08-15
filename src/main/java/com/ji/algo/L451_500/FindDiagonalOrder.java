package com.ji.algo.L451_500;/*
    user ji
    data 2019/8/15
    time 1:48 PM
*/

import java.util.Arrays;

public class FindDiagonalOrder {
    public static void main(String[] args) {
        int arr[][] = {{2, 5}, {8, 4}, {0, -1}};
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }

    public static int[] findDiagonalOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int res[] = new int[row * col];
        boolean flag = true;
        int index = 0;
        int i = 0, j = 0;
        while (index < row * col) {
            if (flag) {
                //开始考虑变换方向
                if (i < 0 || j >= col) {
                    if (j < col) {
                        i = 0;
                    } else {
                        j = col - 1;
                        i = i + 2;
                    }
                    flag = !flag;
                }
                res[index++] = matrix[i][j];
                if (flag) {
                    i--;
                    j++;
                } else {
                    i++;
                    j--;
                }
            } else {
                if (j < 0 || i >= row) {
                    if (i < row) {
                        j = 0;
                    } else {
                        j = j + 2;
                        i = row - 1;
                    }
                    flag = !flag;
                }
                res[index++] = matrix[i][j];
                if (flag) {
                    i--;
                    j++;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}
