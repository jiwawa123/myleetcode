package com.ji.algo.L2551_2600;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/02/17:48
 */
public class L6379 {
    public static void main(String[] args) {

    }

    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            if (nums1[i] < nums2[j]) {
                i++;
            }else{
                j++;
            }

        }
        int min = Math.min(nums1[0], nums2[0]);
        int max = Math.max(nums1[0], nums2[0]);
        return min * 10 + max;
    }
}
