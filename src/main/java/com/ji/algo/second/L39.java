package com.ji.algo.second;

import java.util.*;

/**
 * user ji
 * data 2020/9/9
 * time 9:17 上午
 */
public class L39 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 7};
        System.out.println(new L39().combinationSum(arr, 8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(candidates);
        hs(res, new LinkedList<>(), target, candidates, 0);

        return new LinkedList<>(res);
    }


    public void hs(Set<List<Integer>> res, List<Integer> tmp, int target, int[] candidates, int start) {
        if (target == 0) {
            res.add(new LinkedList<>(tmp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i]) {
                return;
            }
            target -= candidates[i];
            tmp.add(candidates[i]);
            hs(res, tmp, target, candidates, i+1);
            target += candidates[i];
            tmp.remove(tmp.size() - 1);
        }

    }
}
