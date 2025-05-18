package com.ji.algo.L3501_3550;

import java.util.Arrays;

public class L3545 {
    public static void main(String[] args) {
        L3545 l3545 = new L3545();
        System.out.println(l3545.minDeletion("yyyzz", 1));
    }

    public int minDeletion(String s, int k) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        int res = 0;
        Arrays.sort(arr);
        for (int i = 25; i >= 0; i--) {
            if (k == 0) {
                res += arr[i];
            } else {
                if (arr[i] > 0) {
                    k--;
                }
            }
        }

        return res;
    }
}
