package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/21
    time 11:18 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComChar {
    public static void main(String[] args) {
        String arr[] = {"cool"};
        System.out.println(commonChars(arr));
    }

    public static List<String> commonChars(String[] A) {
        int arr[] = new int[26];
        Arrays.fill(arr, Integer.MAX_VALUE);
        for (int i = 0; i < A.length; i++) {
            int tmp[] = new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                tmp[A[i].charAt(j) - 'a'] += 1;
            }
            for (int j = 0; j < 26; j++) {
                arr[j] = Math.min(arr[j], tmp[j]);
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (arr[i] > 0) {
                res.add((char) (i + 'a') + "");
                arr[i]-=1;
            }
        }
        return res;

    }
}
