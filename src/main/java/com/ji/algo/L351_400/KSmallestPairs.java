package com.ji.algo.L351_400;/*
    user ji
    data 2019/4/27
    time 8:21 PM
*/

import java.util.*;

public class KSmallestPairs {
    public static void main(String[] args) {

    }

    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int arr[] = new int[2];
                arr[0] = nums1[i];
                arr[1] = nums2[j];
                tmp.add(arr);
            }
        }
        Collections.sort(tmp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                long a = (long) o1[0] + (long) o1[1];
                long b = (long) o2[0] + (long) o2[1];
                return (int)(a - b);
            }
        });
        List<int[]> re = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            re.add(tmp.get(i));
        }
        return re;
    }
}
