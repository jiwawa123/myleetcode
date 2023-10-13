package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/07/23:06
 */
public class L54 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new L54().spiralOrder(arr);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        int m = matrix.length;
        if (m == 0) return res;
        int n = matrix[0].length;
        boolean st[][] = new boolean[m][n];
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        int dit = 0;
        for (int i = 0, j = 0, k = 0; i < m * n; i++) {
            res.add(matrix[j][k]);
            int a = j + dx[dit];
            int b = k + dy[dit];
            if (a == m || a < 0 || b == n || b < 0 || st[a][b] == true) {
                dit = (dit + 1) % 4;
            }
            st[j][k] = true;
            j += dx[dit];
            k += dy[dit];
        }
        return res;
    }
}
