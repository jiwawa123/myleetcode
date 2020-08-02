package com.ji.algo.yfd;

import org.omg.CORBA.MARSHAL;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * user ji
 * data 2020/8/1
 * time 6:51 下午
 */
public class M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][2];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            max = Math.max(max, arr[i][0]);
            arr[i][1] = sc.nextInt();
            max = Math.max(max, arr[i][1]);
        }
        System.out.println(getRes(arr, max));
    }

    public static int getRes(int arr[][], int max) {
        int imp[] = new int[max + 1];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            for (int j = start; j < end; j++) {
                imp[j] += 1;
                res = Math.max(imp[j], res);
            }
        }
        return res;

    }
}
