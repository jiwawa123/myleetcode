package com.ji.algo.L651_700;/*
    user ji
    data 2019/8/4
    time 10:17 AM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindClosestElements {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,3,5,6,7,8,8};
        FindClosestElements fd = new FindClosestElements();
        fd.findClosestElements(arr, 2, 2);
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int index = getIndex(arr, x);
        int i = index, j = index + 1;
        while (list.size() < k) {
            if (i >= 0 && j <= arr.length - 1) {
                int l = Math.abs(x - arr[i]);
                int r = Math.abs(x - arr[i]);
                if (l <= r) {
                    list.add(0,arr[i--]);
                    continue;
                } else {
                    list.add(arr[j++]);
                    continue;
                }
            }
            if (i >= 0) {
                list.add(0,arr[i--]);
            }
            if (j <= arr.length - 1)
                list.add(arr[j++]);
        }
        return list;
    }

    public int getIndex(int arr[], int x) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int med = (j - i) / 2 + i;
            if (arr[med] == x)
                return med;
            if (arr[med] < x)
                i = med + 1;
            else
                j = med - 1;
        }
        return i;
    }
}
