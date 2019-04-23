package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 9:30 PM
*/

import java.util.ArrayList;
import java.util.List;

public class LengthLIS {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12};
        System.out.println(lengthOfLIS(arr));
    }
    //通过维持一个数组实现二叉插入，从而降低时间复杂度logN，然后整体遍历N，总体上ONlogN

    public static int lengthOfLIS(int[] nums) {
        if (nums == null)
            return 0;
        if (nums.length < 2)
            return nums.length;
        int max = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.size() == 0) {
                list.add(nums[i]);
                continue;
            } else if (nums[i] >= list.get(list.size() - 1)) {
                list.add(nums[i]);
                max = Math.max(list.size(), max);
            } else {
                insert(list, nums[i]);
            }
        }
        return max;
    }

    public static void insert(List<Integer> tmp, int k) {
        int i = 0, j = tmp.size() - 1;
        while (i < j) {
            int med = i + (j - i) / 2;
            if (tmp.get(med) == k)
                return;
            if (k > tmp.get(med))
                i = med + 1;
            else
                j = med - 1;
        }


    }
}
