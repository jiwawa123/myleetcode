package com.ji.algo.L651_700;/*
    user ji
    data 2019/5/12
    time 10:22 PM
*/

public class HasAlternatingBits {
    public static void main(String[] args) {
        hasAlternatingBits(5);
    }

    public static boolean hasAlternatingBits(int n) {
        if (n <= 2)
            return true;
        int tmp = n % 2;
        n /= 2;
        while (n > 0) {
            if (n % 2 == tmp) {
                return false;
            } else {
                tmp = n % 2;
                n /= 2;
            }

        }
        return true;
    }
}
