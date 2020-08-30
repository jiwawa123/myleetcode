package com.ji.algo.second;

import java.util.*;

/**
 * user ji
 * data 2020/8/25
 * time 8:10 上午
 */
public class Combination {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        List<List<Integer>> res = combine(arr);
        System.out.println(res.size());
        System.out.println(res);
    }


    public static List<List<Integer>> combine(int arr[]) {
        Set<List<Integer>> res = new HashSet<>();
        hs(res, 0, arr, new LinkedList<>());
        return new ArrayList<>(res);
    }

    public static void hs(Set<List<Integer>> res, int start, int arr[], List<Integer> tmp) {
        res.add(new LinkedList<>(tmp));
        for (int i = start; i < arr.length; i++) {
            tmp.add(arr[i]);
            hs(res, i + 1, arr, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
