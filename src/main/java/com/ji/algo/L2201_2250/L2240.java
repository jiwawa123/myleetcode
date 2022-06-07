package com.ji.algo.L2201_2250;

/**
 * @Author: Bei Chang
 * @Date: 2022/05/13/下午3:59
 */
public class L2240 {
    public static void main(String[] args) {
        System.out.println(waysToBuyPensPencils(5, 10, 10));
    }

    public static long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int tmp = total / cost1;
        long res = 0;
        for (int i = 0; i <= tmp; i++) {
            int last = total - i * cost1;
            res += last / cost2 + 1;
        }
        return res;
    }
}
