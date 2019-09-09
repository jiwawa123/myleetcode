package com.ji.algo.L351_400;/*
    user ji
    data 2019/9/9
    time 4:50 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTransformedArray {
    public static void main(String[] args) {

    }

    public List<Integer> sortArray(List<Integer> list, int a, int b, int c) {
        if (list.size() == 1)
            return list;
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i);
            ll.add(a * tmp * tmp + b * tmp + c);
        }
        Collections.sort(ll);
        return ll;
    }
    // 大神的
    public int[] sortTransformedArray1(int[] nums, int a, int b, int c) {
        int n = nums.length;
        int[] sorted = new int[n];
        int i = 0, j = n - 1;
        int index = a >= 0 ? n - 1 : 0;
        while (i <= j) {
            if (a >= 0) {
                sorted[index--] = quad(nums[i], a, b, c) >= quad(nums[j], a, b, c) ? quad(nums[i++], a, b, c)
                        : quad(nums[j--], a, b, c);
            } else {
                sorted[index++] = quad(nums[i], a, b, c) >= quad(nums[j], a, b, c) ? quad(nums[j--], a, b, c)
                        : quad(nums[i++], a, b, c);
            }
        }
        return sorted;
    }
    private int quad(int x, int a, int b, int c) {
        return a * x * x + b * x + c;
    }
}
