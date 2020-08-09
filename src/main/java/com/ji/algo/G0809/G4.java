package com.ji.algo.G0809;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * user ji
 * data 2020/8/9
 * time 2:11 下午
 */
public class G4 {
    public static void main(String[] args) {

    }


    public int minCost(int n, int[] cuts) {
        ArrayList<Integer> al = new ArrayList<>(cuts.length + 2);
        for (int cut : cuts) {
            al.add(cut);
        }
        al.add(0);
        al.add(n);
        Collections.sort(al);

        int size = al.size();
        int[][] dp = new int[size][size];
        //单独求2段的代价，其实可以合并到下面的循环中去，令k从2开始就好。
        for (int i = 0; i < size - 2; i++) {
            dp[i][i + 2] = al.get(i + 2) - al.get(i);
        }

        for (int k = 3; k < size; k++) {
            for (int i = 0; i < size - k; i++) {
                for (int j = i + 1; j < i + k; j++) {
                    int tmp = dp[i][j] + dp[j][i + k] + (al.get(i + k) - al.get(i));
                    if (dp[i][i + k] == 0) {
                        dp[i][i + k] = tmp;
                    } else {
                        dp[i][i + k] = Math.min(dp[i][i + k], tmp);
                    }
                }
            }
        }
        return dp[0][size - 1];
    }
}
