package com.ji.algo.L351_400;/*
    user ji
    data 2019/4/27
    time 8:34 PM
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class KthSmallest {
    public static void main(String[] args) {

    }

    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k - 1);
    }
}
