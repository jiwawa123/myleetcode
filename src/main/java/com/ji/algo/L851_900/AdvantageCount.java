package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/6
    time 12:47 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdvantageCount {
    public static void main(String[] args) {
        int A[] = {2, 7, 11, 15}, B[] = {1, 10, 4, 11};
        AdvantageCount advantageCount = new AdvantageCount();
        advantageCount.advantageCount(A, B);
    }

    List<Integer> list;

    public int[] advantageCount(int[] A, int[] B) {
        list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }
        Collections.sort(list);
        int arr[] = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            arr[i] = deal(list, B[i]);
        }
        return arr;
    }

    public int deal(List<Integer> list, int x) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int med = (j - i) / 2 + i;
            if (list.get(med) <= x) {
                i = med + 1;
            } else {
                j = med - 1;
            }
        }
        int tmp;
        j = j < 0 ? 0 : j;
        if (list.get(j) > x) {
            tmp = list.get(j);
            list.remove(j);
        } else {
            j++;
            if (j == list.size()) {
                tmp = list.get(0);
                list.remove(0);
            } else {
                tmp = list.get(j);
                list.remove(j);
            }
        }
        return tmp;
    }

}
