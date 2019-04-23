package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 8:47 PM
*/

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        for (int i = 0; i < len; i++) {
            if (citations[i] >= len - i) {
                return len - i;
            }
        }
        return 0;
    }

}
