package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/20
    time 11:09 AM
*/

import java.util.Arrays;
import java.util.Comparator;

public class ReOrderLogFile {
    public static void main(String[] args) {
//        String[] arr = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
//        System.out.println(Arrays.toString(reorderLogFiles(arr)));
        int arr[] = {2,1,3,6,4};

    }

    public static String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (o1,o2)->help_match(o1, o2));
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
        if (flag) {
            return -1;
        }
        if (flag1) {
            return 1;
        }
        return -1;
    }
}
