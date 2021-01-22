package com.ji.algo.L1701_1750;

/**
 * user ji
 * data 2021/1/12
 * time 10:07 上午
 */
public class L1716 {
    public static void main(String[] args) {
        System.out.println(totalMoney(20));
    }

    public static int totalMoney(int n) {
        int count = 0;
        int index = 28;
        int tmp = 1;
        while (n >= 7) {
            count += index;
            index += 7;
            tmp += 1;
            n -= 7;
        }
        while (n > 0) {
            count += tmp;
            tmp++;
            n--;
        }
        return count;
    }
}
