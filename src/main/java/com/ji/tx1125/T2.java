package com.ji.tx1125;

import java.util.Scanner;

/**
 * user ji
 * data 2020/11/25
 * time 5:18 下午
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getMaxSeq(arr));
    }

    public static int getMaxSeq(int arr[]) {
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (tmp >= 0) {
                tmp += arr[i];
            } else {
                tmp = arr[i];
            }
            max = Math.max(max, tmp);
        }
        return max;
    }
}
