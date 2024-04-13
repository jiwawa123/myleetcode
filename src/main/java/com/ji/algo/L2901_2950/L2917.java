package com.ji.algo.L2901_2950;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/13/20:22
 */
public class L2917 {
    public static void main(String[] args) {

    }

    public int findKOr(int[] nums, int k) {
        int[] tmp = new int[32];
        int res = 0;
        for (int n : nums) {
            int index = 0;
            while (n > 0) {
                if (n % 2 == 1) {
                    tmp[index] += 1;
                }
                n /= 2;
                index++;
            }
        }
        for (int i = 0; i < 32; i++) {
            if (tmp[i] >= k) {
                res += (int) Math.pow(2, i);
            }
        }
        return res;

    }
}
