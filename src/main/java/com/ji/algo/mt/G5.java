package com.ji.algo.mt;

import java.util.Arrays;
import java.util.Scanner;

/**
 * user ji
 * data 2020/8/29
 * time 3:26 下午
 */
public class G5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arrB[] = new int[n];
        Arrays.fill(arrB, -1);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int opt = sc.nextInt();
            if (opt == 1) {
                int k = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                for (int j = 0; j < k; j++) {
                    arrB[y + j - 1] = arr[x + j - 1];
                }
            } else {
                int index = sc.nextInt();
                System.out.println(arrB[index - 1]);
            }
        }
    }
}
