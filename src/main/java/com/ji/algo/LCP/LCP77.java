package com.ji.algo.LCP;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/04/10:28
 */
public class LCP77 {
    public static void main(String[] args) {

    }

    public int runeReserve(int[] runes) {
        if (runes == null || runes.length == 0) {
            return 0;
        }
        Arrays.sort(runes);
        int max = 1;
        int len = 1;
        int f = runes[0];
        for (int i = 1; i < runes.length; i++) {
            if (runes[i] > f + 1) {
                len = 1;
            } else {
                len++;
            }
            f = runes[i];
            max = Math.max(max, len);
        }
        return max;
    }
}
