package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/4/29
    time 7:46 PM
*/

import java.util.Arrays;

public class TwoCity {
    public static void main(String[] args) {

    }
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> {
            return (a[0] - a[1]) - (b[0] - b[1]);
        });
        //前一半取去A市，后一半取去B市，前一半是去A市最合适，
        //后一半市去B市最合适。
        int sum = 0;
        for (int i = 0; i < costs.length; ++i) {
            if (i < costs.length / 2) {
                sum += costs[i][0];
            } else {
                sum += costs[i][1];
            }
        }
        return sum;
    }
}
