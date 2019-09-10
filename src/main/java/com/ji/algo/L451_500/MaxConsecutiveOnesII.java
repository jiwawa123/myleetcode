package com.ji.algo.L451_500;/*
    user ji
    data 2019/9/10
    time 9:22 AM
*/

import java.util.Arrays;

public class MaxConsecutiveOnesII {
    public static void main(String[] args) {
        String tmp[] = "001001101".split("0");
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i].length());
        }
    }

    public int getMaxOnesII(int arr[]) {
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sp.append(arr[i]);
        }
        int max = 0;
        String tmp[] = sp.toString().split("0");
        for (int i = 0; i < tmp.length - 1; i++) {
            max = Math.max(max, tmp[i].length() + 1 + tmp[i + 1].length());
        }
        return max;
    }
}
