package com.ji.algo.jdd;

/**
 * user ji
 * data 2020/8/6
 * time 8:35 下午
 */

import java.util.Scanner;

public class Main {
    int countPrime(int n, int m) {
        int res = 0;
        for (int i = n; i <= m; ++i) {
            String val = Integer.toString(i);
            if (val.length() == 1) {
                if (isPrime(i)) {
                    ++res;
                }
                continue;
            }
            for (int j = 0; j < val.length(); ++j) {
                String left = val.substring(0, j);
                String right = "";
                if (j + 1 < val.length()) {
                    right = val.substring(j + 1);
                }
                String mergedStr = left + right;
                int k = 0;
                while (k < mergedStr.length() && mergedStr.charAt(k) == '0') {
                    ++k;
                }
                mergedStr = mergedStr.substring(k);
                if (isPalindrome(mergedStr) && isPrime(Integer.parseInt(mergedStr))) {
                    ++res;
                    break;
                }

            }
        }
        return res;
    }

    boolean isPalindrome(String str) {
        if (str.length() == 0) return false;
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = main.countPrime(n, m);
        System.out.println(result);
    }

}
