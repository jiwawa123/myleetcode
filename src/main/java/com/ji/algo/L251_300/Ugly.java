package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 8:07 PM
*/

public class Ugly {
    public static void main(String[] args) {

    }

    public boolean isUgly(int num) {
        if (num <= 0)
            return false;
        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;
        return num == 1;
    }
}
