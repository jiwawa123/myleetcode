package com.ji.house;/*
    user ji
    data 2019/10/8
    time 12:13 PM
*/

public class Cal {
    public static void main(String[] args) {
        help(5, 15, 0.05);
    }

    public static void help(int years, double start, double rate) {
        double count = 0;
        for (int i = 0; i < years; i++) {
            count += Math.pow(1.07, years - i) * start;
            start = start * (1 + rate);
        }
        System.out.println(count);
    }
}
