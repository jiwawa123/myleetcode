package com.ji.algo.L2201_2250;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/29/22:18
 */
public class L2215 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> l1 = new HashSet<>();
        Set<Integer> l2 = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int t : nums1
        ) {
            set1.add(t);
        }
        for (int t : nums2
        ) {
            set2.add(t);
            if (!set1.contains(t)) {
                l2.add(t);
            }
        }
        for (int t : nums1
        ) {
            if (!set2.contains(t)) {
                l1.add(t);
            }
        }
        List<List<Integer>> res = new LinkedList<>();
        res.add(new LinkedList<>(l1));
        res.add(new LinkedList<>(l2));
        return res;

    }
}
