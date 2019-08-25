package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/25
    time 9:04 AM
*/

public class LongestMountain {
    public static void main(String[] args) {

    }

    public int longestMountain(int[] A) {
        int max = 0;
        for (int i = 1; i < A.length - 1; i++) {
            int l = 0, r = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] < A[j + 1])
                    l++;
                else
                    break;
            }
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[j - 1])
                    r++;
                else
                    break;
            }
            if (l > 0 && r > 0)
                max = Math.max(max, l + r + 1);
        }
        return max;
    }
}
