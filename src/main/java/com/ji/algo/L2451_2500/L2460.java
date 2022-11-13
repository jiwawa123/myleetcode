package com.ji.algo.L2451_2500;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/13/下午9:20
 */
public class L2460 {
    public static void main(String[] args) {

    }

    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] += nums[i];
                nums[i + 1] = 0;
            }
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }
        Arrays.fill(nums, 0);
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
