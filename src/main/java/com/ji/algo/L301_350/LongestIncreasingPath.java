package com.ji.algo.L301_350;/*
    user ji
    data 2019/7/27
    time 6:01 PM
*/

public class LongestIncreasingPath {
    public static void main(String[] args) {
        int arr[][] = {{9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}};
        System.out.println(new LongestIncreasingPath().longestIncreasingPath(arr));
    }

    int[][] dp;//标记是否走过的数组
    int[][] jyh;//记忆化数组

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) return 0;
        if (matrix.length == 1 && matrix[0].length == 1) return 1;
        dp = matrix;
        jyh = new int[matrix.length][matrix[0].length];
        int[][] arr = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (jyh[i][j] != 0) continue;
                max = Math.max(max, dfs(i, j, arr, Integer.MIN_VALUE));
            }
        }
        return max;
    }

    private int dfs(int x, int y, int[][] arr, int pre) {
        if (arr[x][y] == 1) return 0;
        if (dp[x][y] <= pre) return 0;
        if (jyh[x][y] != 0) {
            return jyh[x][y];
        }
        arr[x][y] = 1;
        int sing;
        int max = 0;
        if (x > 0) {// 上
            max = Math.max(max, dfs(x - 1, y, arr, dp[x][y]) + 1);
        }
        if (x < dp.length - 1) { //下
            max = Math.max(max, dfs(x + 1, y, arr, dp[x][y]) + 1);
        }
        if (y > 0) {  //左
            max = Math.max(max, dfs(x, y - 1, arr, dp[x][y]) + 1);
        }
        if (y < dp[x].length - 1) { //右
            max = Math.max(max, dfs(x, y + 1, arr, dp[x][y]) + 1);
        }
        jyh[x][y] = max;
        arr[x][y] = 0;
        return max;
    }
}
