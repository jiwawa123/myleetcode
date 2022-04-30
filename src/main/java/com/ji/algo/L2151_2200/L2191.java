package com.ji.algo.L2151_2200;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2022/03/13/下午9:14
 */
public class L2191 {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sortJumbled(arr, a));
    }

    public static int[] sortJumbled(int[] mapping, int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            StringBuilder sp = new StringBuilder();
            int tmp = nums[i];
            while (tmp > 0) {
                sp.append(mapping[tmp % 10]);
                tmp /= 10;
            }
            if (sp.length() == 0) {
                res[i] = mapping[0];
                continue;
            }
            res[i] = Integer.parseInt(sp.reverse().toString());

        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (res[j] > res[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    tmp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = tmp;
                }
            }
        }

        return nums;
    }
}
