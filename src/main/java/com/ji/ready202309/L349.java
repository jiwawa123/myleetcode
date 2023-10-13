package com.ji.ready202309;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/11/08:29
 */
public class L349 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        intersection(arr1, arr2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new LinkedList<>();
        int n1 = 0, n2 = 0;
        while (n1 < nums1.length && n2 < nums2.length) {
            if (nums1[n1] == nums2[n2]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[n1]) {
                    list.add(nums1[n1]);
                }
                n1++;
                n2++;
            } else if (nums1[n1] < nums2[n2]) {
                n1++;
            } else {
                n2++;
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
