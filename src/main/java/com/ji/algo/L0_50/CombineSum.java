package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/11
    time 7:50 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        List<List<Integer>> list = new CombineSum().combinationSum(arr,7);
        list.stream().forEach(System.out::println);
    }

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (target == 0)
            return list;
        Arrays.sort(candidates);
        List<Integer> tmp = new ArrayList<>();
        help(tmp,target,0,candidates);
        return list;
    }

    public void help(List<Integer> tmp, int taget, int start, int nums[]) {
        if (taget < 0)
            return;
        if (taget == 0) {
            list.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (nums[i] > taget) {
                break;
            }
            tmp.add(nums[i]);
            help(tmp, taget - nums[i], i, nums);
            tmp.remove(tmp.size() - 1);
        }
    }
}
