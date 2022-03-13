package com.ji.algo.L2151_2200;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/02/20/上午11:35
 */
public class L2164 {
    public static void main(String[] args) {

    }

    public int[] sortEvenOdd(int[] nums) {
        int len = (nums.length + 1) / 2;
        int[] even = new int[len];
        int[] odd = new int[nums.length - len];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even[i / 2] = nums[i];
            } else {
                odd[i / 2] = nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even[i / 2];
            } else {
                nums[i] = odd[odd.length - (i / 2)];
            }
        }
        return nums;

    }
}

