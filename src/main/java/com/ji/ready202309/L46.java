package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/07/08:49
 */
public class L46 {
    public static void main(String[] args) {
        L46 l46 = new L46();
        int[] arr = {1, 2, 3};
        System.out.println(l46.permute(arr));
    }

    int len = 0;
    List<List<Integer>> list = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        len = nums.length;
        boolean[] flag = new boolean[len];
        help(new LinkedList<>(), nums, 0, flag);
        return list;
    }

    public void help(List<Integer> l, int[] nums, int i, boolean[] flag) {
        if (l.size() == len) {
            list.add(new LinkedList<>(l));
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            if (!flag[j]) {
                flag[j] = true;
                l.add(nums[j]);
                help(l, nums, 0, flag);
                flag[j] = false;
                l.remove(l.size() - 1);
            }
        }
    }
}
