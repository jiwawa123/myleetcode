package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/3/24
 * time 8:56 上午
 */
public class L1796 {
    public static void main(String[] args) {

    }

    public int secondHighest(String s) {
        int arr[] = new int[10];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                arr[s.charAt(i) - '0'] += 1;
        }
        int count = 2;
        for (int i = 9; i >= 0; i--) {
            if (arr[i] > 0)
                count--;
            if (count == 0)
                return i;
        }
        return -1;
    }
}
