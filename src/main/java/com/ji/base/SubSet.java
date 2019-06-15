package com.ji.base;/*
    user ji
    data 2019/6/15
    time 9:25 AM
*/

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        help(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void help(List<List<Integer>> list, List<Integer> tmp, int nums[], int start) {
        list.add(tmp);
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            help(list, new ArrayList<>(tmp), nums, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
