package com.ji.algo.L451_500;/*
    user ji
    data 2019/8/23
    time 9:20 AM
*/

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianSlidingWindow {
    public static void main(String[] args) {
        MedianSlidingWindow med = new MedianSlidingWindow();
        int arr[] = {1, 4, 2, 3};
        System.out.println(Arrays.toString(med.medianSlidingWindow(arr, 4)));
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(nums[i]);
        }
        Collections.sort(list);
        double res[] = new double[nums.length - k + 1];
        res[0] = getMeddle(list);
        int j = 1;
        for (int i = k; i < nums.length; i++) {
            list.remove(list.indexOf(nums[i - k]));
            list.add(getInsert(list, nums[i]), nums[i]);
            res[j++] = getMeddle(list);
        }
        return res;
    }

    public double getMeddle(List<Integer> list) {
        int len = list.size();
        if (len % 2 == 1) {
            return 1.0 * list.get(len / 2);
        } else {
            return 1.0 * (long)(list.get(len / 2 ) + (long)list.get(len / 2 - 1)) / 2;
        }
    }

    public int getInsert(List<Integer> list, int k) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int med = (j - i) / 2 + i;
            if (list.get(med) == k) {
                return med;
            }
            if (list.get(med) > k) {
                j = med - 1;
            } else {
                i = med + 1;
            }
        }
        if (i < list.size() && list.get(i) < k)
            i += 1;
        return i;
    }
}
