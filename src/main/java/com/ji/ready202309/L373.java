package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/08/09:22
 */
public class L373 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int i = 0, j = 0;
        List<List<Integer>> res = new LinkedList<>();
        while (i < nums1.length && j < nums2.length && res.size() < k) {
            if (i == nums1.length - 1) {

                List<Integer> l = new LinkedList<>();
                l.add(nums1[i]);
                l.add(nums2[j]);
                res.add(l);
                j++;
                continue;
            }

            if (j == nums2.length - 1) {
                List<Integer> l = new LinkedList<>();
                l.add(nums1[i]);
                l.add(nums2[j]);
                res.add(l);
                i++;
                continue;
            }
            List<Integer> l = new LinkedList<>();
            l.add(nums1[i]);
            l.add(nums2[j]);




        }

        return res;
    }
}
