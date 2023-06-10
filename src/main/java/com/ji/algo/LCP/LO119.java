package com.ji.algo.LCP;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/10/10:04
 */
public class LO119 {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        longestConsecutiveII(arr);
    }

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int len = 1;
        int res = 1;
        int f = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == f + 1) {
                len++;
            } else if (nums[i] > f + 1) {
                len = 1;
            }
            f = nums[i];
            res = Math.max(res, len);
        }
        return res;
    }


    public static int longestConsecutiveII(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums
        ) {
            set.add(n);
        }
        int res = 0;
        for (int n : nums
        ) {
            if (set.contains(n)) {
                int len = 1;
                int left = n - 1;
                int right = n + 1;
                while (set.contains(left)) {
                    len++;
                    set.remove(left);
                    left--;
                }
                while (set.contains(right)) {
                    len++;
                    set.remove(right);
                    right--;
                }
                res = Math.max(res, len);
            }
        }
        return res;
    }
}
