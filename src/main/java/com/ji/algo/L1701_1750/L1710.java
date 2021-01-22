package com.ji.algo.L1701_1750;

import java.util.Arrays;
import java.util.Comparator;

/**
 * user ji
 * data 2021/1/6
 * time 9:57 上午
 */
public class L1710 {
    public static void main(String[] args) {

    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        int count = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int box[] = boxTypes[i];
            if (box[0] >= truckSize) {
                count += truckSize * box[1];
                break;
            } else {
                count += box[0] * box[1];
                truckSize -= box[0];
            }
        }
        return count;
    }
}
