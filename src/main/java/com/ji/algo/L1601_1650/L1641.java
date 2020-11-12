package com.ji.algo.L1601_1650;

import java.util.Arrays;

/**
 * user ji
 * data 2020/11/12
 * time 9:22 下午
 */
public class L1641 {
    public static void main(String[] args) {
        System.out.println(countVowelStrings(1));
        System.out.println(countVowelStrings(2));
        System.out.println(countVowelStrings(33));
        System.out.println(countVowelStrings(50));
    }

    public static int countVowelStrings(int n) {
        int arr[] = new int[5];
        Arrays.fill(arr, 1);
        int count = 0;
        int next[] = new int[5];
        for (int i = 1; i < n; i++) {
            next = new int[5];
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k <= j; k++) {
                    next[j] += arr[k];
                }
            }
            arr = next;
        }

        for (int t : arr
        ) {
            count += t;
        }
        return count;
    }
}
