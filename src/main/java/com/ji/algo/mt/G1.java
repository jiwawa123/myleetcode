package com.ji.algo.mt;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/29
 * time 3:25 下午
 */
public class G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int l = 0;
        boolean f = false;
        for (int i = 0; i < n; i++) {
            if (!f && str.charAt(i) == 'M') {
                f = true;
                continue;
            }
            if (f && str.charAt(i) == 'T') {
                l = i + 1;
                break;
            }
        }
        if (l == str.length()) {
            System.out.println();
            return;
        }

        f = false;
        int j = str.length() - 1;
        for (; j >= l; j--) {
            if (!f && str.charAt(j) == 'T') {
                f = true;
                continue;
            }
            if (f && str.charAt(j) == 'M') {
                break;
            }
        }
        System.out.println(str.substring(l, j));
    }
}
