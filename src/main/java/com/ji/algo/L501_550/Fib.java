package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/9
    time 4:55 PM
*/

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int N) {
        if (N <= 1)
            return N;
        int f = 1;
        int s = 1;
        while (N > 2) {
            int tmp = s;
            s += f;
            f = tmp;
            N--;
        }
        return s;
    }
}
