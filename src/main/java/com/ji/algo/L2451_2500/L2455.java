package com.ji.algo.L2451_2500;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/06/上午11:03
 */
public class L2455 {
    public static void main(String[] args) {

    }

    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int n : nums
        ) {
            if (n % 6 == 0) {
                sum += n;
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        }
        return 0;
    }
}
