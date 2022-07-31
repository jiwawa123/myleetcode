package com.ji.algo.L2251_2300;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/31/上午10:18
 */
public class L2274 {
    public static void main(String[] args) {
        int[] s = {50};
        System.out.println(maxConsecutive(34, 50, s));
    }

    public static int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max = 0;
        int last = 0;
        for (int s : special
        ) {
            last = s;
            if (s < bottom) {
                continue;
            }
            if (s == bottom) {
                bottom = s + 1;
                continue;
            }
            if (s >= top) {
                break;
            }
            if (s > bottom) {

                max = Math.max(max, s - bottom);
                bottom = s + 1;
            }
        }
        if (last < top) {
            max = Math.max(max, top - last);
        }
        return max;
    }
}
