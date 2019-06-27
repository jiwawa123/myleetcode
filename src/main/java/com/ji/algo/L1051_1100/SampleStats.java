package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/6/27
    time 4:36 PM
*/


import java.util.Arrays;

public class SampleStats {
    public static void main(String[] args) {
        int arr[] = {0};
        System.out.println(Arrays.toString(sampleStats(arr)));
    }

    public static double[] sampleStats(int[] count) {
        double[] res = new double[5];
        long sum = 0;
        int min = 256;
        int max = -1;
        int cou = 0;
        int zs = 0;
        int len = 0;
        for (int i = 0; i < count.length; i++) {
            len += count[i];
            sum += count[i] * i;
            len += count[i];
            if (count[i] > 0) {
                min = Math.min(min, i);
                max = i;
            }
            if (count[i] > cou) {
                cou = count[i];
                res[4] = i;
            }
        }
        res[0] = min;
        res[1] = max;
        res[2] = sum / len;
        res[4] = zs;
        int left = len / 2;
        if (len % 2 != 0) {
            int index = 0;
            for (int i = 0; i < 256; i++) {
                if (index <= left && index + count[i] >= left) {
                    res[3] = i;
                    break;
                }
            }
        } else {
            int l = 0;
            int r = 0;
            int index = 0;
            for (int i = 0; i < 256; i++) {
                if (index < left && index + count[i] >= left) {
                    l = i;
                }
                if (index < left + 1 && index + count[i] >= left + 1) {
                    r = i;
                    break;
                }
            }
            res[3] = (l + r) / 2.0;
        }
        return res;
    }
}
