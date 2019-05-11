package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/11
    time 9:34 PM
*/

public class ShortestToChar {
    public static void main(String[] args) {

    }

    public int[] shortestToChar(String S, char C) {
        int arr[] = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int min = Integer.MAX_VALUE;
            if (S.charAt(i) == C) {
                arr[i] = 0;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (S.charAt(j) == C) {
                    min = Math.min(i - j, min);
                    break;
                }
            }
            for (int j = i + 1; j < S.length(); j++) {
                if (S.charAt(j) == C) {
                    min = Math.min(j - i, min);
                    break;
                }
            }
            arr[i] = min;
        }
        return arr;
    }
}
