package com.ji.algo.G0531;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * user ji
 * data 2020/5/31
 * time 10:29 上午
 */
public class G2 {
    public static void main(String[] args) {
        int arr1[] = {3, 1};
        int arr2[] = {1};
        System.out.println(maxArea(5, 4, arr1, arr2));
    }

    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int MAX = (int) Math.pow(10, 9) + 7;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long row = 0;
        long col = 0;
        for (int i = 0; i < horizontalCuts.length + 1; i++) {
            if (i == 0) {
                row = Math.max(horizontalCuts[i] - 0, row);
            } else if (i == horizontalCuts.length) {
                row = Math.max(h - horizontalCuts[i - 1], row);
            } else {
                row = Math.max(horizontalCuts[i] - horizontalCuts[i - 1], row);
            }
        }

        for (int i = 0; i < verticalCuts.length + 1; i++) {
            if (i == 0) {
                col = Math.max(verticalCuts[i] - 0, col);
            } else if (i == verticalCuts.length) {
                col = Math.max(w - verticalCuts[i - 1], col);
            } else {
                col = Math.max(verticalCuts[i] - verticalCuts[i - 1], col);
            }
        }


        return (int) (row % MAX * col % MAX) % MAX;
    }
}
