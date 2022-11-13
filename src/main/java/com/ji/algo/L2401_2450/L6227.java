package com.ji.algo.L2401_2450;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/13/下午9:16
 */
public class L6227 {
    public static void main(String[] args) {

    }

    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        Set<Double> set = new HashSet<>();
        while (i < j) {
            set.add((nums[i++] + nums[j--]) * 1.0 / 2);
        }
        return set.size();
    }
}
