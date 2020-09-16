package com.ji.algo.second;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/9/11
 * time 8:43 上午
 */
public class L216 {
    public static void main(String[] args) {

    }


    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new LinkedList<>();
        hs(res, new LinkedList<>(), 1, n, k);
        return res;
    }

    public void hs(List<List<Integer>> res, List<Integer> tmp, int start, int n, int k) {
        if (tmp.size() == k) {
            res.add(new LinkedList<>(tmp));
            return;
        }
        for (int i = start; i < 10; i++) {
            if (n < i)
                return;
            tmp.add(i);
            n -= i;
            hs(res, tmp, i + 1, n, k);
            n += i;
            tmp.remove(tmp.size() - 1);
        }
    }
}
