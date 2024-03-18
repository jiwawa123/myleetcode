package com.ji.algo.L3001_3050;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/18/08:31
 */
public class L100262 {
    public static void main(String[] args) {

    }

    public int sumOfEncryptedInt(int[] nums) {

        int sum = 0;
        for (int n : nums) {
            int max = 0, t = n, tmp = 0;
            while (n > 0) {
                max = Math.max(max, n % 10);
                n /= 10;
            }
            while (t > 0) {
                tmp = tmp * 10 + max;
                t /= 10;
            }
            sum += tmp;

        }

        return sum;
    }
}
