package com.ji.algo.pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * user ji
 * data 2020/8/2
 * time 7:17 下午
 */
public class G3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int array[] = new int[t+1];
        Arrays.fill(array, Integer.MAX_VALUE);
        if (t == 0) {
            System.out.println(0);
            return;
        }
        int max = Integer.MAX_VALUE;
        int t1 = 0;
        int t2 = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int a = sc.nextInt();
            if (array[a] > h) {
                array[a] = h;
            }

            t1 = Math.max(t1, a);
            if (a >= t) {
                max = Math.min(max, h);
            }
        }
        for (int i = 0; i < m; i++) {
            int h = sc.nextInt();
            int a = sc.nextInt();
            t2 = Math.max(t2, a);
            if (a >= t) {
                max = Math.min(max, h);
            }
            if (array[t - a] + h < res) {
                res = array[t - a] + h;
            }
        }

        if (t1 + t2 < t) {
            System.out.println(-1);
            return;
        }

        if (max > 0) {
            System.out.println(max);
            return;
        }

        System.out.println(res);

    }
}
