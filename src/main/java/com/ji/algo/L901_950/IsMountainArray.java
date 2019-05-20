package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/20
    time 12:22 PM
*/

public class IsMountainArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 5};
        validMountainArray(arr);
    }

    public static boolean validMountainArray(int[] A) {
        if (null == A || A.length < 3)
            return false;
        int high = A[0];
        boolean flag = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == high)
                return false;
            if (flag) {
                if (A[i] > high) {
                    high = A[i];
                } else {
                    if (i == 1)
                        return false;
                    else {
                        flag = false;
                        high = A[i];
                    }
                }
            } else {
                if (A[i] < high) {
                    high = A[i];
                } else {
                    return false;
                }
            }
        }
        return !flag;
    }
}
