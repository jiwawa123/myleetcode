package com.ji.algo.game;/*
    user ji
    data 2019/9/8
    time 10:39 AM
*/

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(1,10,2019));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        int count = 0;
        for (int i = 1971; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                count += 366;
            } else {
                count += 365;
            }
        }
        int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    count += arr[i - 1] + 1;
                } else {
                    count += arr[i - 1];
                }
            } else {
                count += arr[i - 1];
            }
        }
        count += day;
        count %= 7;
        String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return week[(count + 4) % 7];
    }
}
