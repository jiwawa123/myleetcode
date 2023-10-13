package com.ji.ready202309;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/15:30
 */
public class L128 {
    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums
        ) {
            set.add(n);
        }

        for (int n : set
        ) {
            if (!set.contains(n - 1)) {
                int cur = n;
                int len = 0;
                while (set.contains(cur)) {
                    cur++;
                    len++;
                }
                res = Math.max(res, len);
            }
        }

        return res;
    }
}
