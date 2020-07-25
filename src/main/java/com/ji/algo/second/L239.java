package com.ji.algo.second;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/7/24
 * time 2:59 下午
 */
public class L239 {
    public static void main(String[] args) {
        int arr[] = {7, 2, 4};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 2)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2)
            return nums;
        int res[] = new int[nums.length + 1 - k];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[list.getLast()] < nums[i]) {
                list.remove(list.size() - 1);
            }

            list.add(i);
            if (list.getFirst() < i - k + 1) {
                list.remove(0);
            }

            if (i - k + 1 >= 0) {
                res[i - k + 1] = nums[list.get(0)];
            }
        }


        return res;
    }
}
