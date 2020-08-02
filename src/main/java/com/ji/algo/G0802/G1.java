package com.ji.algo.G0802;

/**
 * user ji
 * data 2020/8/2
 * time 10:16 上午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (Math.abs(arr[i] - arr[j]) > a) {
                    continue;
                }
                for (int k = j + 1; k < len; k++) {
                    if (Math.abs(arr[j] - arr[k]) > b) {
                        continue;
                    }
                    if (Math.abs(arr[i] - arr[k]) <= c) {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
