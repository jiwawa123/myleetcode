package com.ji.algo.L1901_1950;

/**
 * user ji
 * data 2021/7/24
 * time 10:49 下午
 *
 * @author ji
 */
public class L1925 {
    public static void main(String[] args) {
        System.out.println(countTriples(5));
    }

    public static int countTriples(int n) {
        if (n < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                int tmp = (i * i) + (j * j);
                int sqrt = (int) Math.sqrt(tmp);
                if (sqrt * sqrt == tmp && sqrt <= n) {
                    count += 2;
                }
            }
        }
        return count;
    }
}
