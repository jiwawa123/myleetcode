package com.ji.algo.pdd;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/2
 * time 7:00 下午
 */
public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        int tmp = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (tmp + arr[i] > d) {
                res++;
                d = tmp + arr[i] - d;
                continue;
            }
            if (tmp + arr[i] == d) {
                System.out.println("paradox");
                return;
            }
            tmp += arr[i];
        }
        System.out.println(Math.abs(tmp - d) + " " + res);
    }
}
