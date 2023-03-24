package com.ji.algo.L2551_2600;

/**
 * @Author: Bei Chang
 * @Date: 2023/03/24/下午8:17
 */
public class L2595 {
    public static void main(String[] args) {
        evenOddBit(2);
    }

    public static  int[] evenOddBit(int n) {
        int[] res = new int[2];
        StringBuilder sp = new StringBuilder();
        while (n > 0) {
            sp.append(n % 2);
            n /= 2;
        }
        String binary = sp.toString();
        for (int i = 0; i < binary.length(); i++) {
            if (i % 2 == 0 && binary.charAt(i) == '1') {
                res[0]++;
            }
            if (i % 2 == 1 && binary.charAt(i) == '1') {
                res[1]++;
            }
        }
        return res;
    }
}
