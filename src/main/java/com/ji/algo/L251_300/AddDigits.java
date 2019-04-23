package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 8:01 PM
*/

public class AddDigits {
    public static void main(String[] args) {

    }

    public int addDigits(int num) {
        if (num < 10)
            return num;
        int tmp = 0;
        while (num > 0) {
            tmp += num % 10;
            num /= 10;
        }
        return addDigits(tmp);
    }
}
