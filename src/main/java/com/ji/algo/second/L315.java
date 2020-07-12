package com.ji.algo.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/7/11
 * time 8:58 上午
 */
public class L315 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        countSmallerII(arr).forEach(System.out::println);

    }

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                count += nums[j] < nums[i] ? 1 : 0;
            }
            list.add(count);
        }
        return list;
    }

    public static List<Integer> countSmallerII(int[] nums) {
        List<Integer> list = new LinkedList<>();
        List<Integer> tmp = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = helpBinarySearch(tmp, nums[i]);
            list.add(index);
        }
        Collections.reverse(list);
        return list;
    }

    public static int helpBinarySearch(List<Integer> list, int target) {
        int l = 0, r = list.size() - 1;
        while (l <= r) {
            int med = (r - l) / 2 + l;
            if (list.get(med) >= target) {
                r = med - 1;
            } else {
                l = med + 1;
            }
        }
        list.add(l, target);
        return l;
    }
}
