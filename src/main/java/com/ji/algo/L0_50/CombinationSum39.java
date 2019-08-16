package com.ji.algo.L0_50;/*
    user ji
    data 2019/8/16
    time 4:49 PM
*/

import java.util.*;

public class CombinationSum39 {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target <= 0)
            return list;
        Arrays.sort(candidates);
        help(new ArrayList(), target, candidates, 0);
        return list;
    }

    public void help(List<Integer> li, int target, int[] candidates, int start) {
        if (target < 0)
            return;
        if (target == 0) {
            list.add(li);
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            li.add(candidates[i]);
            help(new ArrayList(li), target - candidates[i], candidates, i);
            li.remove(li.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum39 com = new CombinationSum39();
        int arr[] = {2, 3, 5};
        List<List<Integer>> list = com.combinationSum(arr, 11);
        for (List<Integer> tmp : list
                ) {
            tmp.forEach(System.out::print);
            System.out.println();
        }
    }
}
