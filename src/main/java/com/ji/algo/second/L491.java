package com.ji.algo.second;

import java.util.*;

/**
 * user ji
 * data 2020/8/25
 * time 7:56 上午
 */
public class L491 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        hs(new LinkedList<>(), res, 0, nums);
        return new ArrayList<>(res);
    }

    public void hs(List<Integer> tmp, Set<List<Integer>> res, int start, int nums[]) {
        if (tmp.size() >= 2) {
            res.add(new ArrayList<>(tmp));
        }
        for (int i = start; i < nums.length; i++) {
            if (tmp.size() == 0) {
                tmp.add(nums[i]);
                hs(tmp, res, i + 1, nums);
                tmp.remove(tmp.size() - 1);
            } else {
                if (tmp.get(tmp.size() - 1) <= nums[i]) {
                    tmp.add(nums[i]);
                    hs(tmp, res, i + 1, nums);
                    tmp.remove(tmp.size() - 1);
                }
            }
        }

    }
}
