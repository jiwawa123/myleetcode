package com.ji.algo.LCP;

import com.ji.algo.game.G0217.L;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/23/16:47
 */
public class L0104 {
    public static void main(String[] args) {
        L0104 l = new L0104();
        int[] arr = {4, 2, 1};
        l.combinationSum4(arr, 32);
    }

    Set<String> set = new HashSet<>();
    List<Integer> list = new LinkedList<>();

    public int combinationSum4(int[] nums, int target) {
        backtracing(nums, target);
        return set.size();
    }

    public void backtracing(int[] nums, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            StringBuilder sp = new StringBuilder();
            for (int t : list
            ) {
                sp.append(t + ",");
            }
            set.add(sp.toString());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            backtracing(nums, target - nums[i]);
            list.remove(list.size() - 1);
        }
    }
}
