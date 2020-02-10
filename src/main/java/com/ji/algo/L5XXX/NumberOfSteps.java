package com.ji.algo.L5XXX;/*
    user ji
    data 2020/2/10
    time 12:11 PM
*/

public class NumberOfSteps {
    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0)
                num /= 2;
            else
                num -= 1;
            step++;

        }
        return step;
    }
}
