package com.ji.algo.LCP;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/06/下午10:33
 */
public class L50 {
    public static void main(String[] args) {

    }

    public int giveGem(int[] gem, int[][] operations) {
        for (int i = 0; i < operations.length; i++) {
            int part = gem[operations[i][0]] / 2;
            gem[operations[i][0]] -= part;
            gem[operations[i][1]] += part;

        }
        Arrays.sort(gem);
        return gem[gem.length - 1] - gem[0];
    }
}
