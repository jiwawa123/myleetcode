package com.ji.algo.second;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/9/8
 * time 8:38 上午
 */
public class L77 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> combine(int n, int k) {
        boolean arr[] = new boolean[n];
        List<List<Integer>> res = new LinkedList<>();
        hs(res,new LinkedList<>(),k,arr,0);
        return res;
    }

    public void hs(List<List<Integer>> res, List<Integer> tmp, int k, boolean arr[], int start) {
        if (tmp.size() == k) {
            res.add(new LinkedList<>(tmp));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (!arr[i]) {
                arr[i] = true;
                tmp.add(i + 1);
                hs(res, tmp, k, arr, i + 1);
                arr[i] = false;
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
