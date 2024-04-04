package com.ji.algo.L3051_L3100;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/09/20:13
 */
public class L3069 {
    public static void main(String[] args) {

    }

    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (list1.get(list1.size() - 1) > list2.get(list2.size() - 1)) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        int[] res = new int[nums.length];

        for (int i = 0; i < list1.size(); i++) {
            res[i] = list1.get(i);
        }

        for (int i = 0; i < list2.size(); i++) {
            res[i + list1.size()] = list2.get(i);
        }

        return res;
    }
}
