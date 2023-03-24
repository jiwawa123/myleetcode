package com.ji.algo.L2551_2600;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/02/19/下午5:42
 */
public class L2558 {
    public static void main(String[] args) {

    }

    public long pickGifts(int[] gifts, int k) {

        int res = 0;
        int len = gifts.length - 1;
        while (k > 0) {
            Arrays.sort(gifts);
            gifts[len] = (int) Math.sqrt(gifts[len]);
            k--;
        }
        for (int t : gifts
        ) {
            res += t;
        }
        return res;
    }
}
