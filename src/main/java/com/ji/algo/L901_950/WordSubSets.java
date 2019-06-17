package com.ji.algo.L901_950;/*
    user ji
    data 2019/6/17
    time 2:17 PM
*/

import java.util.ArrayList;
import java.util.List;

public class WordSubSets {
    public static void main(String[] args) {

    }

    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> tmp = new ArrayList();
        int arr[][] = new int[A.length][26];
        int arrB[][] = new int[B.length][26];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                arr[i][A[i].charAt(j) - 'a'] += 1;
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length(); j++) {
                arrB[i][B[i].charAt(j) - 'a'] += 1;
            }
        }
        int last[] = new int[26];
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < 26; j++) {
                last[j] = Math.max(last[j], arrB[i][j]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (help(arr[i],last))
                tmp.add(A[i]);

        }
        return tmp;
    }

    public boolean help(int a[], int b[]) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] > a[i])
                return false;
        }
        return true;
    }
}
