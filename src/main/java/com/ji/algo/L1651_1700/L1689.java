package com.ji.algo.L1651_1700;

/**
 * user ji
 * data 2020/12/26
 * time 12:06 上午
 */
public class L1689 {
    public static void main(String[] args) {

    }

    public int minPartitions(String n) {
        int max = 0;
        for (char t : n.toCharArray()
        ) {
            max = Math.max(max, t - '0');
        }
        return max;
    }
}
