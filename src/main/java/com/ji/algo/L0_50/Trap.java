package com.ji.algo.L0_50;/*
    user ji
    data 2019/8/18
    time 9:18 PM
*/

public class Trap {
    public static void main(String[] args) {
        int arr[] = {4, 2, 3};
        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
        int count = 0;
        for (int l = 0, lm = 0, r = height.length - 1, rm = 0; l < r;) {
            lm = Math.max(lm, height[l]);
            rm = Math.max(rm, height[r]);
            if (lm < rm) count += lm - height[l++];
            else count += rm - height[r--];
        }
        return count;
    }
}
