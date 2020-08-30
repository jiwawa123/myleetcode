package com.ji.algo.tx;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/23
 * time 7:58 下午
 */
public class G5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(n % 2);
        }
    }
}
