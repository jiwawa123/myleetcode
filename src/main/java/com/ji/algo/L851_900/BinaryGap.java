package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/26
    time 7:06 PM
*/

import java.util.Arrays;

public class BinaryGap {
    public static void main(String[] args) {

    }

    public int binaryGap(int N) {

        int max = 0;
        int index = -1;
        int len = 0;
        while (N > 0) {
            if (N % 2 == 1) {
                if (index == -1) {
                    index = len;
                } else {
                    max = Math.max(max, len - index);
                    index = len;
                }
            }
            len++;
            N /= 2;
        }
        return max;
    }
}
