package com.ji.algo.LCP;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/23/16:27
 */
public class Offer079 {
    public static void main(String[] args) {
        Offer079 offer079 = new Offer079();
        int[] arr = {1, 2};
        offer079.subsets(arr);
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtracing(nums, 0);
        return res;
    }

    public void backtracing(int[] nums, int startIndex) {
        res.add(new ArrayList<>(list));
        for (int i = startIndex; i < nums.length; i++) {
            list.add(nums[i]);
            backtracing(nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
