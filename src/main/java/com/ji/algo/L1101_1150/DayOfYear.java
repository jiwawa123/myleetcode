package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/8/12
    time 9:26 AM
*/

public class DayOfYear {
    public static void main(String[] args) {

    }

    public int dayOfYear(String date) {
        int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String tmp[] = date.split("-");
        int month = Integer.valueOf(tmp[1]) - 1;
        int count = 0;
        int m = 0;
        while (m < month) {
            if (m == 1) {
                count += isRun(tmp[0]) ? arr[m] + 1 : arr[m];
            } else {
                count += arr[m];
            }
            m++;
        }
        return count + Integer.valueOf(tmp[2]);
    }

    public boolean isRun(String string) {
        int year = Integer.valueOf(string);
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        if (year % 400 == 0)
            return true;
        return false;
    }
}
