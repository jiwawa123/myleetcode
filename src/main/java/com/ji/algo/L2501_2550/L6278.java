package com.ji.algo.L2501_2550;

/**
 * @Author: Bei Chang
 * @Date: 2023/01/02/上午9:18
 */
public class L6278 {
    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }

    public static int countDigits(int num) {
        int count = 0;
        int tmp = num;
        while (num > 0) {
            int last = num % 10;
            count += tmp % last == 0 ? 1 : 0;
            num /= 10;
        }


        return count;
    }
}
