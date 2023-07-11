package com.ji.algo.L2651_2700;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/09/21:31
 */
public class L2673 {
    public static void main(String[] args) {
        L2673 l2673 = new L2673();
        int[] arr = {1, 5, 2, 2, 3, 3, 1};
        System.out.println(l2673.minIncrements(7, arr));

    }

    int res = 0;
    int len;

    public int minIncrements(int n, int[] cost) {
        len = cost.length;
        int l = 2, r = 3;
        help(l, r, cost);
        return res;
    }

    public void help(int l, int r, int[] cost) {
        if (l > len || r > len) {
            return;
        }
        res += Math.abs(cost[l - 1] - cost[r - 1]);
        help(2 * l, 2 * l + 1, cost);
        help(2 * r, 2 * r + 1, cost);
    }
}
