package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/9/3
    time 10:31 AM
*/

public class DaysOfMouth {
    public static void main(String[] args) {

    }

    public int getDays(int year, int mouth) {
        int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = (year % 4 == 0 && year % 100 != 0) || (year != 100) ? 1 : 0;
        if(mouth==2)
            return arr[mouth-1]+count;
        return arr[mouth-1];
    }
}
