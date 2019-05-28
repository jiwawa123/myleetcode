package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/28
    time 11:24 AM
*/

public class SortByDivideTwo {
    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 == 0) {
                i++;
            } else {
                //开始交换
                if (A[j] % 2 == 0) {
                    int tmp = A[j];
                    A[j] = A[i];
                    A[i] = tmp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            }
        }
        return A;
    }
}
