package com.ji.algo.hw;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/19
 * time 8:12 下午
 */
public class G3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < a.length(); i++) {
            max1 = Math.max(a.charAt(i) - '0', max1);
        }
        for (int i = 0; i < b.length(); i++) {
            max2 = Math.max(b.charAt(i) - '0', max2);
        }
        System.out.println(Math.abs(max1 - max2));
    }
}
