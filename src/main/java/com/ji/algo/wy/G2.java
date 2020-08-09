package com.ji.algo.wy;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/8
 * time 2:56 下午
 */
public class G2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n + 1];
        int m = scanner.nextInt();
        int tmp[] = new int[m];
        for (int i = 0; i < m; i++) {
            int cur = scanner.nextInt();
            tmp[i] = cur;
            arr[cur] = 1;
        }

        int last[] = new int[n - m];
        int start = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                last[start++] = i;
            }
        }

        int i = 0, j = 0;
        StringBuilder sp = new StringBuilder();
        while (i < tmp.length && j < last.length) {
            if (tmp[i] < last[j]) {
                sp.append(tmp[i++] + " ");
            } else {
                sp.append(last[j++] + " ");
            }
        }
        while (i < tmp.length) {
            sp.append(tmp[i++] + " ");
        }
        while (j < last.length) {
            sp.append(last[j++] + " ");
        }
        System.out.println(sp.toString().trim());
    }
}
