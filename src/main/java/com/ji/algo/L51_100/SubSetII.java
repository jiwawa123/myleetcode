package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 7:59 PM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubSetII {
    public static void main(String[] args) {
        int arr[] = {4, 4, 1, 4, 4};
        List<List<Integer>> tmp = new SubSetII().subsetsWithDup(arr);
        System.out.println(tmp.size());
        tmp.stream().forEach(System.out::println);
    }

    HashSet<List<Integer>> list = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        if (null == nums || nums.length == 0)
            return new ArrayList<>(list);
        Arrays.sort(nums);
        List<Integer> tmp = new ArrayList<>();
        help(tmp, 0, nums);
        return new ArrayList<>(list);

    }

    public void help(List<Integer> tmp, int start, int nums[]) {
        list.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            help(new ArrayList<>(tmp), i + 1, nums);
            tmp.remove(tmp.size() - 1);
        }
    }
}
