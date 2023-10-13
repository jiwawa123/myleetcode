package com.ji.ready202309;

import java.util.Scanner;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/08:35
 */
public class L88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0, left = 0, left1 = 0;
        int[] arr = new int[m + n];
        while (left < m && left1 < n) {
            if (nums1[left] < nums2[left1]) {
                arr[index] = nums1[left];
                left++;
            } else {
                arr[index] = nums2[left1];
            }
            index++;
        }

        while (left < m) {
            arr[index++] = nums1[left++];
        }
        while (left1 < n) {
            arr[index++] = nums2[left1++];
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}
