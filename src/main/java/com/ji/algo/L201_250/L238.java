package com.ji.algo.L201_250;/*
    user ji
    data 2019/9/27
    time 5:01 PM
*/

import java.util.Arrays;

public class L238 {
    public static void main(String[] args) {
        int tmp[] = {1, 0};
        System.out.println(Arrays.toString(productExceptSelf(tmp)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int count = 0;
        int tmp = 1;
        for (int k : nums) {
            count += k == 0 ? 1 : 0;
            tmp *= k == 0 ? 1 : k;
        }
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (count > 1)
                    res[i] = 0;
                else
                    res[i] = tmp;
            } else {
                if (count > 0)
                    res[i] = 0;
                else
                    res[i] = tmp / nums[i];
            }

        }
        return res;

    }

    //使用迭乘的方式
    public int[] productExceptSelfIII(int[] nums) {
        int len = nums.length;
        int[] re = new int[len];
        if (len == 0) return new int[]{0};
        int help = 1;
        for (int i = 0; i < len; i++) {
            re[i] = help;
            help *= nums[i];
        }
        help = 1;
        for (int i = len - 1; i >= 0; i--) {
            re[i] *= help;
            help *= nums[i];
        }
        return re;
    }
}
