package com.ji.algo.G0802;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/8/2
 * time 10:16 上午
 */
public class G3 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10};
        System.out.println(maxSum(arr1, arr2));
    }

    public static int maxSum(int[] nums1, int[] nums2) {
        int max = (int) Math.pow(10, 9) + 7;
        Map<Integer, Integer> f = new HashMap<>();
        int l1 = nums1.length;
        int l2 = nums2.length;
        long arr1[] = new long[l1];
        long arr2[] = new long[l2];
        int i = 0, j = 0;
        while (i < l1 || j < l2) {
            if (i >= l1) { // l1已经用完
                arr2[j] = nums2[j];
                if (j > 0) {
                    arr2[j] += arr2[j - 1] % max;
                    arr2[j] %= max;
                }
                j++;
                continue;
            }
            if (j >= l2) {
                arr1[i] = nums1[i];
                if (i > 0) {
                    arr1[i] += arr1[i - 1] % max;
                    arr1[i] %= max;
                }
                i++;
                continue;
            }

            int tmp = Math.min(nums1[i], nums2[j]);
            if (tmp == nums1[i]) {
                long m = tmp;
                if (i > 0) {
                    m = arr1[i - 1] % max + tmp;
                }

                f.put(tmp, (int) Math.max(m % max, f.getOrDefault(tmp, 0)));
                arr1[i] = f.get(tmp);
            }

            if (tmp == nums2[j]) {
                long m = tmp % max;
                if (j > 0) {
                    m = arr2[j - 1] + tmp;
                }
                f.put(tmp, (int) Math.max(m % max, f.getOrDefault(tmp, 0)));
                arr2[j] = f.get(tmp);
            }


            if (tmp == nums1[i]) {
                arr1[i] = Math.max(arr1[i], f.get(tmp));
                i++;
            }
            if (tmp == nums2[j]) {
                arr2[j] = Math.max(arr2[j], f.get(tmp));
                j++;
            }

        }

        return (int) Math.max(arr1[l1 - 1] % max, arr2[l2 - 1] % max) % max;
    }
}
