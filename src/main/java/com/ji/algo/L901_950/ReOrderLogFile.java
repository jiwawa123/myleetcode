package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/20
    time 11:09 AM
*/

import java.util.Arrays;
import java.util.Comparator;

public class ReOrderLogFile {
    public static void main(String[] args) {
        String str = "a1 9 2 3 1";
        String str1 = "zo4 4 7";
        System.out.println(help_match(str, str1));

    }

    public static String[] reorderLogFiles(String[] logs) {
        for (int i = logs.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (help_match(logs[j - 1], logs[j]) > 0) {
                    String tmp = logs[j];
                    logs[j] = logs[j - 1];
                    logs[j - 1] = tmp;
                }
            }
        }
        return logs;
    }

    public static int help_match(String a, String b) {
        String arr[] = a.split(" ");
        String arr1[] = b.split(" ");
        boolean flag = false, flag1 = false;
        for (int i = 0; i < arr[1].length(); i++) {
            if (arr[1].charAt(i) >= 'a' && arr[1].charAt(i) <= 'z') {
                flag = true;
                break;
            }
        }
        for (int i = 0; i < arr1[1].length(); i++) {
            if (arr1[1].charAt(i) >= 'a' && arr1[1].charAt(i) <= 'z') {
                flag1 = true;
                break;
            }
        }
        if (flag && flag1) {
            int i = 1, j = 1;
            while (i < arr.length && j < arr1.length) {
                if (compare(arr[i], arr1[j]) > 0) {
                    return 1;
                }
                if (compare(arr[i], arr1[j]) < 0)
                    return -1;
                i++;
                j++;
            }
            if (arr.length == arr1.length) {
                return arr[0].compareTo(arr1[0]);
            }
            return arr.length - arr1.length;
        }
        if (flag1) {
            return 1;
        }
        return -1;
    }

    public static int compare(String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) < b.charAt(j))
                return -1;
            if (a.charAt(i) > b.charAt(j))
                return 1;
            i++;
            j++;
        }
        return a.length() - b.length();
    }
}
