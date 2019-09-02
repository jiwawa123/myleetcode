package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/9/2
    time 10:03 AM
*/

public class NumPrimeArrangements {
    public static void main(String[] args) {
        System.out.println(numPrimeArrangements(100));
    }

    public static int numPrimeArrangements(int n) {
        int max = 1000000007;
        if (n < 3)
            return 1;
        int l = 1, r = 1;
        long lc = 1, rc = 1;
        int index = 3;
        while (index <= n) {
            if (isPrime(index)) {
                r++;
                rc = (rc * r) % max;
            } else {
                l++;
                lc = (lc * l) % max;
            }
            index++;
        }
        System.out.println(rc + " " + lc + " " + l + " " + r);
        return (int) (lc * rc % max);
    }

    public static boolean isPrime(int num) {
        if (num <= 3) {
            return num > 1;
        }
        // 不在6的倍数两侧的一定不是质数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
