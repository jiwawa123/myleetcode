package com.ji.sql;

import java.util.Scanner;

/**
 * user ji
 * data 2021/6/26
 * time 8:24 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 1) {
            Scanner sc2 = new Scanner(System.in);
            String k = sc2.nextLine();
            while (k != null && !k.equals("")) {
                count++;
                k = sc2.nextLine();
            }
        }
        System.out.println(count);
    }
}
