package com.ji.algo.wy;

import java.util.*;

/**
 * user ji
 * data 2020/8/8
 * time 2:56 下午
 */
public class G1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            if (t < 2) {
                continue;
            }
            res += t / 2;

        }
        System.out.println(res);
    }

}
