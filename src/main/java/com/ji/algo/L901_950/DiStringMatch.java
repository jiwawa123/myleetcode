package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/20
    time 11:04 AM
*/

public class DiStringMatch {
    public static void main(String[] args) {

    }

    public int[] diStringMatch(String S) {
        int arr[] = new int[S.length() + 1];
        int i = 0, j = S.length();
        for (int k = 0; k < S.length(); k++) {
            if (S.charAt(k) == 'I') {
                arr[k] = i++;
            } else {
                arr[k] = j--;
            }
        }
        arr[S.length()] = i;
        return arr;
    }
}
