package com.ji.algo.L2051_2100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ji
 * @data 2021/12/8
 * @time 10:02 下午
 */
public class L2078 {
    public static void main(String[] args) {

    }

    public int maxDistance(int[] colors) {
        int count = 0;
        int start = 0, end = colors.length - 1;
        if (colors[start] == colors[end]) {
            for (int i = start + 1; i < end; i++) {
                if (colors[i] != colors[start]) {
                    count = Math.max(count, i - start);
                    count = Math.max(count, end - i);
                    break;
                }
            }
            for (int i = end - 1; i > start; i--) {
                if (colors[i] != colors[start]) {
                    count = Math.max(count, i - start);
                    count = Math.max(count, end - i);
                    break;
                }
            }
            return count;
        }
        return end - start;
    }
}
