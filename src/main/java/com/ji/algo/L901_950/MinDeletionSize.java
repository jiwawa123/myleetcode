package com.ji.algo.L901_950;/*
    user ji
    data 2019/6/2
    time 12:51 PM
*/

public class MinDeletionSize {
    public static void main(String[] args) {

    }

    public int minDeletionSize(String[] A) {
        if (A == null || A.length == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if(A[j].charAt(i)<A[j-1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
