package com.ji.algo.L2251_2300;

/**
 * @Author: Bei Chang
 * @Date: 2022/06/02/下午10:02
 */
public class L2283 {
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }

    public static boolean digitCount(String num) {
        int[] arr = new int[10];
        for (int i = 0; i < num.length(); i++) {
            arr[num.charAt(i) - '0'] += 1;
        }
        for (int i = 0; i < num.length(); i++) {
            int tmp = num.charAt(i) - '0';
            if (arr[i] != tmp) {
                return false;
            }
        }
        return true;
    }
}
