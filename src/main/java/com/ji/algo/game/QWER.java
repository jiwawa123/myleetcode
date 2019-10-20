package com.ji.algo.game;/*
    user ji
    data 2019/10/20
    time 10:42 AM
*/

import java.util.Arrays;

public class QWER {
    public static void main(String[] args) {
        System.out.println(balancedString("QWER"));
    }


    public static int balancedString(String s) {
        int arr[] = new int[4];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'Q':
                    arr[0]++;
                    break;
                case 'W':
                    arr[1]++;
                    break;
                case 'E':
                    arr[2]++;
                    break;
                case 'R':
                    arr[3]++;
                    break;
            }
        }
        int bal = s.length() / 4;
        int con = 0;
        int arr2[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > bal) {
                con += arr[i] - bal;
                arr2[i] = arr[i] - bal;
            }
        }
        if (con == 0)
            return 0;
        if (con == 3 * bal)
            return 3 * bal;
        int max = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i < con)
                break;
            int arr1[] = new int[4];
            for (int j = 0; j < 4; j++) {
                arr1[j] = arr2[j];
            }
            for (int j = i; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case 'Q':
                        arr1[0]--;
                        break;
                    case 'W':
                        arr1[1]--;
                        break;
                    case 'E':
                        arr1[2]--;
                        break;
                    case 'R':
                        arr1[3]--;
                        break;
                }
                if (arr1[0] <= 0 && arr1[1] <= 0 && arr1[2] <= 0 && arr1[3] <= 0) {
//                    System.out.println("i  j " + i + " " + j);
                    max = Math.min(max, j - i + 1);
                    break;
                }
            }
        }
        return max;
    }
}
