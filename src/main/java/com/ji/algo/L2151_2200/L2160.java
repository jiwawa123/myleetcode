package com.ji.algo.L2151_2200;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/02/20/上午8:41
 */
public class L2160 {
    public static void main(String[] args) {

    }

    public int minimumSum(int num) {

        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);

        return Integer.valueOf(String.valueOf(chars[0]) + String.valueOf(chars[3]))
                + Integer.valueOf(String.valueOf(chars[1]) + String.valueOf(chars[2]));
    }
}
