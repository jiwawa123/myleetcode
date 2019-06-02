package com.ji.algo.L851_900;/*
    user ji
    data 2019/6/2
    time 6:05 PM
*/

import java.util.HashMap;
import java.util.Map;

public class FairCandySwap {
    public static void main(String[] args) {
        int arr1[] = {1, 1};
        int arr2[] = {2, 2};
        System.out.println(fairCandySwap(arr1, arr2));
    }

    public static int[] fairCandySwap(int[] A, int[] B) {
        int count = 0;
        int count1 = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            count += A[i];
        }
        for (int i = 0; i < B.length; i++) {
            count1 += B[i];
            map.put(B[i], i);
        }
        int arr[] = new int[2];
        int diff = (count - count1) / 2;
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i] - diff)) {
                arr[0] = A[i];
                arr[1] = A[i] - diff;
                break;
            }
        }
        return arr;
    }
}
