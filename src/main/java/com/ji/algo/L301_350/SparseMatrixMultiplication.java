package com.ji.algo.L301_350;/*
    user ji
    data 2019/9/3
    time 3:03 PM
*/

import java.util.HashMap;
import java.util.Map;

public class SparseMatrixMultiplication {
    public static void main(String[] args) {

    }

    public int[][] SparseMatrix(int A[][], int B[][]) {
        int row = A.length;
        int col = B[0].length;
        int res[][] = new int[row][col];
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(i, new HashMap<>());
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != 0)
                    map.get(i).put(j, A[i][j]);
            }
        }
        for (int i = 0; i < row; i++) {
            Map<Integer, Integer> tmp = map.get(i);
            for (int j = 0; j < col; j++) {
                int count = 0;
                for (int k : tmp.keySet()
                        ) {
                    count += tmp.get(k) * B[j][k];
                }
                res[i][j] = count;
            }
        }
        return res;
    }
}
