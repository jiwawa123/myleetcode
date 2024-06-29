package com.ji.algo.L3001_3050;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/14/17:26
 */
public class G0414_1 {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrime(3));
        int[] arr = {3, 17};
        System.out.println(maximumPrimeDifference(arr));
    }

    public static int maximumPrimeDifference(int[] nums) {
        int max = 0;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                if (last == -1) {
                    last = i;
                } else {
                    max = Math.max(max, i - last);
                }
            }
        }


        return max;
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3 || n == 5) {
            return true;
        }
        int l = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                l++;
                if (l >= 2) {
                    return false;
                }

            }
        }
        return false;
    }
}
