package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/24
    time 8:53 AM
*/

import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {

    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new LinkedList<>();
        int next = 0;
        int i = A.length - 1;
        while (i >= 0 && K > 0) {
            list.add(0, (K % 10 + A[i] + next) % 10);
            next = (K % 10 + A[i] + next) / 10;
            i--;
            K /= 10;
        }
        while (K > 0) {
            list.add(0, (K % 10 + next) % 10);
            next = (K % 10 + next) / 10;
            K /= 10;
        }
        while (i >= 0) {
            list.add(0, (A[i] + next) % 10);
            next = (A[i] % 10 + next) / 10;
            i--;
        }
        if (next > 0) {
            list.add(0, next);
        }
        return list;
    }
}
