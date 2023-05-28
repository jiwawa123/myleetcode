package com.ji.algo.L2651_2700;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/03/09:41
 */
public class L2657 {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4};
        int[] b = {3, 1, 2, 4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(a, b)));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            Set set = new HashSet();
            for (int j = 0; j <= i; j++) {
                set.add(A[j]);
            }
            map.put(i, set);
        }
        for (int i = 0; i < B.length; i++) {
            Set set = map.get(i);
            int len = 0;
            for (int j = 0; j <= i; j++) {
                if (set.contains(B[j])) {
                    len++;
                }
            }
            res[i] = len;
        }
        return res;
    }
}
