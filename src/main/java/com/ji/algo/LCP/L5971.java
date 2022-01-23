package com.ji.algo.LCP;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/23/下午8:12
 */
public class L5971 {
    public static void main(String[] args) {

    }

    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0;
        for (int i = cost.length; i >= 0; i--) {
            if (i >= 2) {
                res += cost[i--];
                res += cost[i--];
            } else {
                res += cost[i];
            }
        }

        return res;
    }
}
