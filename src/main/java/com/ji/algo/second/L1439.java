package com.ji.algo.second;

import java.util.*;

/**
 * user ji
 * data 2020/7/25
 * time 9:42 上午
 */
public class L1439 {
    public static void main(String[] args) {

    }

    public int kthSmallest(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        List<Integer> list = new LinkedList<>();
        list.add(0);
        for (int i = 0; i < m; i++) {
            List<Integer> tmp = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                for (int t : list
                ) {
                    tmp.add(t + mat[i][j]);
                }
            }
            Collections.sort(tmp);
            // 作出合理的剪枝即可
            list = tmp.subList(0, Math.min(k, tmp.size()));
        }
        return list.get(k - 1);
    }
}
