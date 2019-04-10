package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/10
    time 9:38 PM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermuteUnique {
    public static void main(String[] args) {
        int arr[] = {1,2,2};
        List<List<Integer>> li = new PermuteUnique().permuteUnique(arr);
        li.stream().forEach(System.out::println);
    }

    HashSet<List<Integer>> list = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> tmp = new ArrayList<>();
        List<Integer> tt = new ArrayList<>();
        help(tmp, nums, tt);
        return new ArrayList<>(list);
    }

    public void help(List<Integer> tmp, int nums[], List<Integer> tt) {
        if (tmp.size() == nums.length) {
            list.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tt.contains(i))
                continue;
            tt.add(i);
            tmp.add(nums[i]);
            help(tmp, nums, new ArrayList<>(tt));
            tmp.remove(tmp.size() - 1);
            tt.remove(tt.size() - 1);

        }

    }
}
