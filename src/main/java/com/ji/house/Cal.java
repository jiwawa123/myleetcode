package com.ji.house;/*
    user ji
    data 2019/10/8
    time 12:13 PM
*/

public class Cal {
    public static void main(String[] args) {
        help(40, 10, 1.1, 35, 0.05, 0);
    }

    public static void help(double count, int years, double profit, double start, double rate, double cost) {
        for (int i = 0; i < years; i++) {
            count += start - cost;
            count *= profit;
            start = start * (1 + rate);
            System.out.println(count + " " + i);
        }
        System.out.println(count);
    }
}
