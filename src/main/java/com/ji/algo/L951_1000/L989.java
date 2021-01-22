package com.ji.algo.L951_1000;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2021/1/22
 * time 8:25 下午
 */
public class L989 {
    public static void main(String[] args) {

    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new LinkedList();
        int i = 0;
        int next = 0;
        while (K > 0 && i >= 0) {
            int tmp = K % 10 + A[i] + next;
            next = tmp / 10;
            res.add(0, tmp % 10);
            K /= 10;
            i--;
        }
        while (K > 0) {
            res.add(0, (K % 10 + next) % 10);
            next = (K % 10 + next) / 10;
            K /= 10;
        }
        while (i >= 0) {
            res.add(0, (A[i] + next) % 10);
            next = (A[i] + next) / 10;
            i--;
        }
        return res;
    }
}
