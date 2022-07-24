package com.ji.algo.L2301_2350;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/20/下午9:10
 */
public class L2315 {
    public static void main(String[] args) {

    }

    public int countAsterisks(String s) {
        int count = 0;
        int tmp = 0;
        int count_ = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                count_++;
                if (count_ % 2 != 0) {
                    count += tmp;
                }
                tmp = 0;
                continue;
            }
            if (s.charAt(i) == '*') {
                tmp++;
            }
        }
        return count + tmp;
    }
}
