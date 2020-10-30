package com.ji.algo.L1601;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/10/28
 * time 2:57 下午
 */
public class L1630 {
    public static void main(String[] args) {

    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new LinkedList<>();
        for (int i = 0; i < l.length; i++) {
            int start = l[i];
            int end = r[i];
            int arr[] = new int[end - start + 1];
            for (int j = start; j <= end; j++) {
                arr[j - start] = nums[j];
            }
            Arrays.sort(arr);
            if (isArithmeticSubarrays(arr))
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }

    public boolean isArithmeticSubarrays(int arr[]) {
        if (arr.length < 2)
            return true;
        int d = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (d != arr[i] - arr[i - 1])
                return false;
        }
        return true;
    }
}
