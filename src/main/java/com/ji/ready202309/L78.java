package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/13:36
 */
public class L78 {
    List<List<Integer>> list = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        list.add(new LinkedList<>());
        help(nums, new LinkedList<>(), 0);
        return list;
    }

    public void help(int[] nums, List<Integer> li, int start) {
        if (li.size() > 0) {
            list.add(new LinkedList<>(li));
        }
        for (int i = start; i < nums.length; i++) {
            li.add(nums[i]);
            help(nums, li, i + 1);
            li.remove(li.size() - 1);
        }
    }
}
