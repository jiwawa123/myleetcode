package com.ji.algo.game;/*
    user ji
    data 2019/10/6
    time 4:27 PM
*/

import java.util.HashMap;
import java.util.Map;

public class MinCostToMoveChips {
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 3, 3};
        System.out.println(minCostToMoveChips(arr));
    }

    public static int minCostToMoveChips(int[] chips) {
        int l = 0;
        int r = 0;
        for (int k : chips
                ) {
            if (k % 2 == 0) {
                r++;
            } else {
                l++;
            }
        }
        return Math.min(l, r);
    }
}
