package com.ji.algo.L2701_2750;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/09/21:10
 */
public class L2748 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4};
        new L2748().countBeautifulPairs(arr);
    }

    public int countBeautifulPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (isGcd(nums[i], nums[j])) {
                    res++;
                }
            }
        }
        return res;
    }

    public boolean isGcd(int a, int b) {
        int t1 = Integer.valueOf(String.valueOf(a).charAt(0)) - '0';
        int t2 = b % 10;
        a = Math.min(t1, t2);
        b = Math.max(t1, t2);

        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }
        return true;
    }
}
