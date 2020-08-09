package com.ji.algo.wy;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/8
 * time 2:56 下午
 */
public class G3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int arr[] = new int[len];
            for (int j = 0; j < len; j++) {
                arr[i] = sc.nextInt();
            }
            getMin(arr);
        }
    }

    public static void getMin(int arr[]) {
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }
        if (arr.length == 2 && arr[0] != arr[1]) {
            System.out.println(arr[0]+arr[1]);
            return;
        }
        System.out.println(0);
    }

}
