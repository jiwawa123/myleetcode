package com.ji.algo.L1001_1050;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/10/14
 * time 8:18 上午
 */
public class L1002 {
    public static void main(String[] args) {

    }

    public List<String> commonChars(String[] A) {
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
