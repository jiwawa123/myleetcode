package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/3
    time 7:23 PM
*/

public class FindComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int n) {
        int count = 0;
        int res = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                res += Math.pow(2, count);
            }
            count++;
            n /= 2;
        }
        return res;
    }
}
