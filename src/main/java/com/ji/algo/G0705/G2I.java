package com.ji.algo.G0705;

import java.util.Arrays;

/**
 * user ji
 * data 2020/7/5
 * time 4:41 下午
 */
public class G2I {
    public static void main(String[] args) {

    }

    public int getLastMoment(int n, int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        int min = 0;
        if (left.length > 0) {
            min = Math.max(min, left[left.length - 1]);
        }
        if (right.length > 0) {
            min = Math.max(min, n - right[0]);
        }
        return min;
    }
}
