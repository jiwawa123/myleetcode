package com.ji.algo.L1701_1750;

/**
 * user ji
 * data 2021/1/12
 * time 10:13 上午
 */
public class L1720 {
    public static void main(String[] args) {

    }

    public int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int arr[] = new int[len + 1];
        arr[0] = first;
        for (int i = 1; i < len + 1; i++) {
            arr[i] = arr[i - 1] ^ encoded[i-1];
        }

        return arr;
    }
}
