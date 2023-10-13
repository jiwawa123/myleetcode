package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/04/18:47
 */
public class L172 {
    public static void main(String[] args) {

    }

    public int trailingZeroes(int n) {
        int ans = 0;
        for (int i = 5; i <= n; i += 5) {
            for (int x = i; x % 5 == 0; x /= 5) {
                ++ans;
            }
        }
        return ans;
    }
}
