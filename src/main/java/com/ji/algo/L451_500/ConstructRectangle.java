package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/5
    time 9:24 PM
*/

public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int[] arr = new int[2];
        int tmp = (int) Math.sqrt(area);
        if (tmp * tmp == area) {
            arr[0] = arr[1] = tmp;
            return arr;
        } else {
            int l = tmp;
            int w = tmp;
            while (l * w != area) {
                if (l * w < area) {
                    l++;
                } else {
                    w--;
                }
            }
            arr[0] = l;
            arr[1] = w;
            return arr;
        }
    }
}
