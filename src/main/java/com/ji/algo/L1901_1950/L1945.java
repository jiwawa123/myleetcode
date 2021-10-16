package com.ji.algo.L1901_1950;

/**
 * @author ji
 * @data 2021/7/31
 * @time 12:42 上午
 */
public class L1945 {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }

    public static int getLucky(String s, int k) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - 'a' + 1;
            while (t > 0) {
                count += t % 10;
                t /= 10;
            }
        }
        while (k > 1) {
            long next = 0;
            while (count > 0) {
                next += count % 10;
                count /= 10;
            }
            k--;
            count = next;
        }
        return (int) count;
    }
}
