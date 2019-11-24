package com.ji.algo.game.G1110;/*
    user ji
    data 2019/11/10
    time 10:28 AM
*/

import java.util.*;
import java.util.stream.Collectors;

public class G2 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 0, 1, 0, 1, 2, 0, 1};
        reconstructMatrix(5, 5, arr).stream().forEach(System.out::println);
    }

    public static List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> res = new ArrayList<>();
        int one = 0;
        int two = 0;
        int n = colsum.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (colsum[i] == 2) {
                two++;
                arr1[i] = 1;
                arr2[i] = 1;
            }
            if (colsum[i] == 1)
                one++;

        }
        if (two > upper || two > lower)
            return res;
        if (two * 2 + one != upper + lower)
            return res;
        upper -= two;
        for (int i = 0; i < n; i++) {
            if (colsum[i] == 2 || colsum[i] == 0)
                continue;
            if (upper > 0) {
                arr1[i] = 1;
                upper--;
            } else {
                arr2[i] = 1;
            }
        }
        List<Integer> l1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        res.add(l1);
        List<Integer> l2 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        res.add(l2);
        return res;
    }
}
