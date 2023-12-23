package com.ji.algo.L2951_3000;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/12/12/09:42
 */
public class L2956 {
    public static void main(String[] args) {

    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int t : nums1
        ) {
            set1.add(t);
        }
        int c1 = 0, c2 = 0;
        for (int t : nums2
        ) {
            set2.add(t);
            if (set1.contains(t)) {
                c2++;
            }
        }
        for (int t : nums1
        ) {
            if (set2.contains(t)) {
                c1++;
            }
        }
        int[] res = {c1, c2};
        return res;
    }
}
