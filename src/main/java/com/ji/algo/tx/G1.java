package com.ji.algo.tx;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/23
 * time 7:57 下午
 */
public class G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (i != m - 1) {
                sp.append(val);
                if (i != n - 1) {
                    sp.append(" ");
                }
            }
        }

        System.out.println(sp.toString());

    }


}
