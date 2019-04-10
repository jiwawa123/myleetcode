package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/10
    time 9:31 PM
*/

import java.util.ArrayList;
import java.util.List;

public class Permute {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> li = new Permute().permute(arr);
        li.stream().forEach(System.out::println);
    }

    List<List<Integer>> list;

    public List<List<Integer>> permute(int[] nums) {
        list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        help(tmp, nums);
        return list;
    }

    public void help(List<Integer> tmp, int nums[]) {
        if (tmp.size() == nums.length) {
            list.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tmp.contains(nums[i]))
                continue;
            tmp.add(nums[i]);
            help(tmp, nums);
            tmp.remove(tmp.size() - 1);
        }
    }
}
