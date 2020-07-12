package com.ji.algo.G0705;

/**
 * user ji
 * data 2020/7/5
 * time 4:09 下午
 */
public class G3 {
    public static void main(String[] args) {
        int arr[][] = {{1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}};
        System.out.println(numSubmat(arr));
    }

    public static int numSubmat(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            int len = 0;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    len++;
                } else {
                    len = 0;
                }
                mat[i][j] = len;
            }
        }
        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = i; k >= 0; k--) {
                    min = Math.min(mat[k][j], min);
                    if (min == 0) break;
                    total += min;
                    System.out.println(min);
                }
            }
        }
        return total;
    }

}
