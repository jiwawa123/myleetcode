package com.ji.algo.L2601_2650;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/22/12:53
 */
public class L2614 {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
        int[][] arr = new int[3][3];
        int index = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = index++;
            }
        }
    }

    public static int diagonalPrime(int[][] nums) {
        int len = nums.length;
        int max = len * len;
        int res = 0;
        int index = 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j || (i + j) == len - 1) {
                    if (isPrime(index)) {
                        res = Math.max(index, res);
                    }
                }
                index++;
            }
        }
        return res;
    }

    public static boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }
        // 只有6x-1和6x+1的数才有可能是质数
        if (n % 6 != 1 && n % 6 != 5) {
            return false;
        }
        // 判断这些数能否被小于sqrt(n)的奇数整除
        int sqrt = (int) Math.sqrt(n);
        for (int i = 5; i <= sqrt; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
