package com.ji.algo.L251_300;/*
    user ji
    data 2019/9/9
    time 4:08 PM
*/

import java.util.Arrays;

public class GraphValidTree {
    public static void main(String[] args) {

    }

    public boolean graphValidTree(int n, int arr[][]) {
        int flag[] = new int[n];
        Arrays.fill(flag, -1);
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            while (flag[start] != -1) {
                start = flag[start];
            }
            while (flag[end] != -1) {
                end = flag[end];
            }
            if (start == end)
                return false;
            flag[arr[i][1]] = start;
        }
        int count = 0;
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == -1) {
                count++;
                if (count > 1)
                    return false;
            }
        }
        return true;
    }
}
