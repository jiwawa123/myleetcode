package com.ji.algo.L3001_3050;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2024/05/01/10:42
 */
public class L3131 {
    public static void main(String[] args) {

    }

    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums1[0] - nums2[0];
    }
}
