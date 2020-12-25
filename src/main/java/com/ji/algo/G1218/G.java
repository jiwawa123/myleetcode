package com.ji.algo.G1218;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * user ji
 * data 2020/12/18
 * time 8:42 下午
 */
public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p[] = new int[n];
        int q[] = new int[n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
            if (p[i] > 0) {
                t++;
            }
            q[i] = scanner.nextInt();
        }
        // 全是正或者负数
        if (t == n || t == 0) {
            System.out.println(0);
            return;
        }

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n - 1; i++) {
            Map<Integer, Integer> tmp = new HashMap<>();
            for (int j = 1; j <= m; j++) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()
                ) {
                    int res = entry.getKey() + p[i] * (int) Math.pow(j, q[i]);
                    tmp.put(res, tmp.getOrDefault(res, 0) + entry.getValue());
                }
            }
            map = tmp;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
        ) {
            if (isTrue(entry.getKey(), p[n - 1], q[n - 1], m)) {
                count += entry.getValue();
            }
        }

        System.out.println(count);
    }

    public static boolean isTrue(int res, int p, int q, int m) {
        double tmp = Math.pow(-res * 1.0 / p, 1.0 / q);
        if (Math.pow(tmp, q) * p == -res && tmp <= m && tmp > 0) {
            return true;
        }
        return false;
    }
}
