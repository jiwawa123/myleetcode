package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 3:55 PM
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> re = new Subsets().subsets(arr);
        re.stream().forEach(System.out::println);
    }

    List<List<Integer>> list;

    public List<List<Integer>> subsets(int[] nums) {
        list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        help(tmp, 0, nums);
        return list;
    }

    public void help(List<Integer> tmp, int start, int nums[]) {
        list.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            if (tmp.contains(nums[i])) {
                continue;
            }
            tmp.add(nums[i]);
            help(tmp, i+1, nums);
            tmp.remove(tmp.size() - 1);
        }
    }


}
