package com.ji.algo.L1351_1400;/*
    user ji
    data 2020/2/23
    time 3:16 PM
*/

public class DaysBetweenDates {
    public static void main(String[] args) {
        DaysBetweenDates daysBetweenDates = new DaysBetweenDates();
        System.out.println(daysBetweenDates.base("1971-06-29"));
//        System.out.println(daysBetweenDates.base("2010-09-23"));
    }

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(base(date1) - base(date2));
    }

    public int base(String date) {
        String dateArray[] = date.split("-");
        int year = Integer.valueOf(dateArray[0]);
        int month = Integer.valueOf(dateArray[1]);
        int day = Integer.valueOf(dateArray[2]);
        int i = 1971, j = 1;
        int count = 0;
        int mon[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while (i < year) {
            if ((i % 4 == 0 && (i % 100) != 0) || year % 400 == 0) {
                count += 366;
                System.out.println(i);
            } else {
                count += 365;
            }
            i++;
        }
        while (j < month) {
            count += mon[j - 1];
            if (j == 2) {
                if ((year % 4 == 0 && (year % 100) != 0) || (year % 400 == 0)) {
                    count += 1;
                }
            }
            j++;
        }
        return count + day;
    }
}
