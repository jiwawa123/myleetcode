package com.ji.algo.L2901_2950;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/12/08/16:38
 */
public class L2946 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 1, 2}, {5, 5, 5, 5}, {6, 3, 6, 3}};
        new L2946().areSimilar(arr, 2);

    }

    public boolean areSimilar(int[][] mat, int k) {
        for (int i = 0; i < mat.length; i++) {
            int[] tmp = Arrays.copyOf(mat[i], mat[i].length);
            for (int j = 0; j < mat[i].length; j++) {
                if (i % 2 == 0) {
                    mat[i][(j + k) % mat[i].length] = tmp[j];
                } else {
                    mat[i][(j + mat[i].length - k) % mat[i].length] = tmp[j];
                }
            }
            if (!isSame(tmp, mat[i])) {
                return false;
            }
        }

        return true;
    }

    public boolean isSame(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}
