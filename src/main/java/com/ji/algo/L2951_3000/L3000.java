package com.ji.algo.L2951_3000;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/13/08:53
 */
public class L3000 {
    public static void main(String[] args) {
        int[][] arr = {{8, 6}, {2, 10}};
        areaOfMaxDiagonal(arr);
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int len = 0, area = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int tmpLen = dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1];
            if (tmpLen > len) {
                len = tmpLen;
                area = dimensions[i][0] * dimensions[i][1];
            } else if (tmpLen == len) {
                area = Math.max(area, dimensions[i][0] * dimensions[i][1]);
            }
        }
        return area;

    }
}
