package com.ji.algo.L2201_2250;

/**
 * @Author: Bei Chang
 * @Date: 2022/05/02/上午10:37
 */
public class L2239 {
    public static void main(String[] args) {

    }

    public int findClosestNumber(int[] nums) {
        int res = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int t : nums
        ) {
            int next = Math.abs(t);
            if (next < min) {
                res = t;
                min = next;
            } else if (next == min) {
                res = Math.max(res,t);
            }
        }
        return res;
    }
}
