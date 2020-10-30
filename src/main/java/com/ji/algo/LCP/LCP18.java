package com.ji.algo.LCP;

import java.util.Arrays;

/**
 * user ji
 * data 2020/10/23
 * time 4:22 下午
 */
public class LCP18 {
    public static void main(String[] args) {

    }

    int max = (int) Math.pow(10, 9) + 7;

    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int res = 0;

        Arrays.sort(staple);
        Arrays.sort(drinks);
        for (int i = staple.length - 1; i >= 0; i--) {
            if (staple[i] > x) {
                continue;
            }
            res += getIndex(drinks, x - staple[i]);
            res %= max;
        }


        return res;
    }

    public int getIndex(int arr[], int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int med = (j - i) / 2 + i;
            if (arr[med] <= target) {
                i = med + 1;
            } else {
                j = med - 1;
            }
        }
        int res = Math.min(j, i);
        res = Math.max(res, 0);
        if (arr[res] <= target)
            return res + 1;
        return res % max;
    }
}
