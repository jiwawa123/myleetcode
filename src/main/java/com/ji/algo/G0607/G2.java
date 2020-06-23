package com.ji.algo.G0607;

import java.util.Arrays;

/**
 * user ji
 * data 2020/6/7
 * time 10:27 上午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = {-7,22,17,3};
        System.out.println(Arrays.toString(getStrongest(arr, 2)));
    }

    public static int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int med = arr[(arr.length-1)/2];

        int res[] = new int[k];

        int len = 0;
        int i = 0, j = arr.length - 1;
        while (len < k) {
            if (Math.abs(arr[i] - med) >= Math.abs(arr[j] - med)) {
                res[len++] = arr[i++];
            } else {
                res[len++] = arr[j--];
            }
        }
        return res;
    }
}
