package com.ji.algo.mt;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/29
 * time 3:25 下午
 */
public class G2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sp = new StringBuilder();
        boolean flag[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            boolean tmp = false;
            for (int j = 0; j < n; j++) {
                int t = sc.nextInt();
                if (tmp)
                    continue;
                if (flag[t]) {
                    continue;
                }
                sp.append(t);
                if (i != n - 1) {
                    sp.append(" ");
                }
                flag[t] = true;
                tmp = true;
            }
        }
        System.out.println(sp.toString());
    }
}
