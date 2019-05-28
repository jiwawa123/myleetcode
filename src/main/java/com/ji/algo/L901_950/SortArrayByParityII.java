package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/28
    time 12:22 PM
*/

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int arr[] = {4,2,5,7};
        sortArrayByParityII(arr);
    }

    public static int[] sortArrayByParityII(int[] A) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                list.add(A[i]);
            } else {
                list1.add(A[i]);
            }
        }

        for (int i = 0,j=0; i < A.length; i += 2) {
            A[i] = list.get(j);
            A[i + 1] = list.get(j);
            j++;
        }
        return A;
    }
}
