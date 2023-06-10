package com.ji.algo.LCP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/10/18:58
 */
public class KthLargest {
    List<Integer> list = new ArrayList<>();
    int k;

    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - k; i < nums.length; i++) {
            list.add(nums[i]);
        }
        this.k = k;
    }

    public int add(int val) {
        int index = find(val);
        if (list.size() < k) {
            list.add(index, val);

        } else {
            if (val > list.get(0)) {
                list.add(index, val);
                list.remove(0);

            }
        }
        return list.get(0);

    }

    public int find(int val) {
        int start = 0, end = list.size() - 1;
        while (start <= end) {
            int med = (end + start) / 2;
            if (list.get(med) == val) {
                return med;
            } else if (list.get(med) < val) {
                start++;
            } else {
                end--;
            }
        }
        return start;
    }
}
