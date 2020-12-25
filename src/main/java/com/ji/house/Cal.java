package com.ji.house;/*
    user ji
    data 2019/10/8
    time 12:13 PM
*/

public class Cal {
    public static void main(String[] args) {
        help(50, 20, 55, 0.05, 12);
    }

    public static void help(double count, int years, double start, double rate, double cost) {
        for (int i = 0; i < years; i++) {
            count += start - cost;
            
            if (i > 10) {
                start = start * (1 + rate);
            } else {
                start = 0;
            }
            System.out.println(count + " " + i);
        }
        System.out.println(count);
    }
}
