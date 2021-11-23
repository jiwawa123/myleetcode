package com.ji.algo.L2001_2050;

import java.util.*;

/**
 * @author ji
 * @data 2021/10/16
 * @time 10:31 下午
 */
public class L2032 {
    public static void main(String[] args) {
        int arr1[] = {1, 1, 3, 2};
        int arr2[] = {2, 3};
        int arr3[] = {3};
        twoOutOfThree(arr1, arr2, arr3);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        Set<Integer> list = new HashSet<Integer>();
        int i = 0, j = 0, s = 0;
        while (i < nums1.length || j < nums2.length || s < nums3.length) {
            int min = Integer.MAX_VALUE;
            if (i <= nums1.length - 1) {
                min = Math.min(min, nums1[i]);
            }

            if (j <= nums2.length - 1) {
                min = Math.min(min, nums2[j]);
            }

            if (s <= nums3.length - 1) {
                min = Math.min(min, nums3[s]);
            }

            int tmp = 0;
            if (i <= nums1.length - 1 && min == nums1[i]) {
                i++;
                tmp++;
            }

            if (j <= nums2.length - 1 && min == nums2[j]) {
                j++;
                tmp++;
            }

            if (s <= nums3.length - 1 && min == nums3[s]) {
                s++;
                tmp++;
            }
            if (tmp > 1) {
                list.add(min);
            }

        }
        return new ArrayList<>(list);
    }
}
