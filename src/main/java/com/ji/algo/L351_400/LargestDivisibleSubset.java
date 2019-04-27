package com.ji.algo.L351_400;/*
    user ji
    data 2019/4/27
    time 7:49 PM
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] arr = {2,3,4,9,8};
        largestDivisibleSubset(arr);
    }

    public static List<Integer> largestDivisibleSubset(int nums[]) {
        List<Integer> list = new ArrayList<>();
        if (nums == null)
            return list;
        Arrays.sort(nums);
        List<List<Integer>> set = new ArrayList<>();
        int index = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(nums[0]);
                set.add(tmp);
                continue;
            }
            int count = 0;
            int index1 = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0) {
                    if (set.get(j).size() > count) {
                        count = set.get(j).size();
                        index1 = j;
                    }
                }
            }
            List<Integer> tmp1;
            if (index1 != -1)
                tmp1 = new ArrayList<>(set.get(index1));
            else
                tmp1 = new ArrayList<>();
            tmp1.add(nums[i]);
            set.add(tmp1);
            if (tmp1.size() > sum) {
                index = i;
                sum = tmp1.size();
            }
        }
        return set.get(index);
    }
}
