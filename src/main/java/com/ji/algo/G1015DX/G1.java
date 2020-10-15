package com.ji.algo.G1015DX;

import java.util.Scanner;

/**
 * user ji
 * data 2020/10/15
 * time 6:27 下午
 */
public class G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ugly[] = new int[n];
        ugly[0] = 1;
        int i = 0, j = 0, k = 0;
        for (int idx = 1; idx < n; idx++) {
            int tmp = Math.min(ugly[i] * 2, Math.min(ugly[j] * 3, ugly[k] * 5));
            if (tmp == ugly[i] * 2) i++;
            if (tmp == ugly[j] * 3) j++;
            if (tmp == ugly[k] * 5) k++;
            ugly[idx] = tmp;
        }
        System.out.println(ugly[n - 1]);
    }
}
