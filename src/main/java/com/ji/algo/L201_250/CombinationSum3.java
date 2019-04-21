package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/21
    time 8:50 PM
*/

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        new CombinationSum3().combinationSum3(3, 7);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        if (n >= k * 9 || n <= k)
            return list;
        help(list, new ArrayList<>(), k, n, 1);
        return list;

    }

    public void help(List<List<Integer>> list, List<Integer> tmp, int k, int n, int start) {
        int sum = sum_List(tmp);
        if (tmp.size() > k || sum > n)
            return;
        if (tmp.size() == k && sum == n) {
            list.add(tmp);
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (sum + i > n)
                break;
            tmp.add(i);
            help(list, new ArrayList<>(tmp), k, n, i + 1);
            tmp.remove(tmp.size() - 1);
        }

    }

    public int sum_List(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
