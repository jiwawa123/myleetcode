package com.ji.new_algo;/*
    user ji
    data 2019/6/18
    time 2:59 PM
*/

public class OS {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        int max = 10000;
        int arr[][] = new int[max][max];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                arr[i][j] = 0;
            }
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                arr[j][i] = 0;
            }
        }
        System.out.println(System.currentTimeMillis() - b);
    }
}
