package com.ji.ready202309;

import java.util.Scanner;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/04/18:54
 */
public class L191 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-3));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        String str = sc.next();
        double d = sc.nextDouble();
        long l = sc.nextLong();
        
    }

    public int hammingWeight(int n) {
        int res = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                res++;
            }
        }
        return res;
    }
}
