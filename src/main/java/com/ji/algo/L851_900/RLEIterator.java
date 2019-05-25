package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/25
    time 9:09 AM
*/

import java.util.ArrayList;
import java.util.List;

public class RLEIterator {
    List<Integer> list = new ArrayList<>();

    public RLEIterator(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0 && A[i] == 0) {
                i++;
            } else {
                list.add(A[i]);
            }
        }
    }

    public int next(int n) {
        int i = 0;
        while (n > 0 && i < list.size() - 1) {
            if (list.get(i) == 0) {
                i += 2;
                continue;
            }
            if (list.get(i) > n) {
                list.set(i, list.get(i) - n);
                return list.get(i + 1);
            }
            if (list.get(i) == n) {
                list.set(i, 0);
                return list.get(i + 1);
            } else {
                n -= list.get(i);
                list.set(i, 0);
            }
        }
        if (n > 0)
            return -1;
        return list.get(i + 1);

    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 0, 9, 2, 5};
        RLEIterator rleIterator = new RLEIterator(arr);
        rleIterator.next(2);
        rleIterator.next(1);
        rleIterator.next(1);
        rleIterator.next(2);
    }
}
