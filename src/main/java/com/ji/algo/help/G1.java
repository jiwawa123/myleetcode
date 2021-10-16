package com.ji.algo.help;

import java.util.Scanner;

/**
 * @author ji
 * @data 2021/8/21
 * @time 9:58 下午
 */
public class G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(getMaxLen(n, a, b, c));
    }

    public static int getMaxLen(int n, int a, int b, int c) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            int tmp = 0;
            if (i - a >= 0 && arr[i - a] >= 0) {
                tmp = Math.max(tmp, 1 + arr[i - a]);
            }
            if (i - b >= 0 && arr[i - b] > 0) {
                tmp = Math.max(tmp, 1 + arr[i - b]);
            }
            if (i - c >= 0 && arr[i - a] > 0) {
                tmp = Math.max(tmp, 1 + arr[i - b]);
            }
            arr[i] = tmp;
        }
        return arr[n] - 1;
    }
}
