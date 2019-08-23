package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/23
    time 9:52 PM
*/

public class MaxProfitAssignment {
    public static void main(String[] args) {

    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int count = 0;
        for (int i = 0; i < worker.length; i++) {
            int tmp = 0;
            for (int j = 0; j < difficulty.length; j++) {
                if (worker[i] >= difficulty[j])
                    tmp = Math.max(tmp, profit[j]);
            }
            count += tmp;
        }
        return count;
    }
}
