package com.ji.algo.L2801_2850;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/02/16:36
 */
public class L2834 {
    public static void main(String[] args) {

    }

    public long minimumPossibleSum(int n, int target) {
        Set<Integer> set = new HashSet<>();
        long sum = 0;
        int len = 0;
        int index = 1;
        while (len < n) {
            if (set.contains(target - index)) {
                set.add(index);
                sum += index;
                len++;
            }
            index++;
        }
        return sum;
    }
}
