package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/04/18:11
 */
public class L77 {
    public static void main(String[] args) {

    }

    List<List<Integer>> res;

    public List<List<Integer>> combine(int n, int k) {
        res = new LinkedList<>();
        dfs(n, 1, k, new LinkedList<>());
        return res;
    }

    public void dfs(int n, int start, int k, List<Integer> list) {
        if (list.size() == k) {
            res.add(new LinkedList<>(list));
            return;
        }

        if (start > n || (list.size() + (n - start)) < k) {
            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i);
            dfs(n, i + 1, k, list);
            list.remove(list.size() - 1);
        }
    }
}
