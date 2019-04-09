package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/9
    time 9:53 AM
*/

public class Rotate {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = i * 5 + j + 1;
            }
        }
        rotate(arr);
    }

    //每次交换四个元素即可
    public static void rotate(int[][] matrix) {
        for (int s = 0, e = matrix.length - 1; s < e; ++s, --e) {//判断是否还需要旋转
            for (int i = s, j = e; i < e; ++i, --j) {//确定循环的次数和旋转的位置
                {
                    int temp = matrix[s][i];
                    matrix[s][i] = matrix[j][s];
                    matrix[j][s] = matrix[e][j];
                    matrix[e][j] = matrix[i][e];
                    matrix[i][e] = temp;
                }

            }
        }
    }

}
