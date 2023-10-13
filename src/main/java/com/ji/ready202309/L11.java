package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/23:49
 */
public class L11 {
    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int res = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int m = Math.min(height[i], height[j]);
            res = Math.max(res, (j - i) * m);
            if (height[i] == m) {
                i++;
            } else {
                j--;
            }
        }

        return res;
    }
}
