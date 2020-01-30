package com.ji.algo.game.G0112;/*
    user ji
    data 2020/1/12
    time 10:54 AM
*/

import java.util.Arrays;

public class G3_1 {
    public static void main(String[] args) {
        G3_1 g3 = new G3_1();
        int arr[][] = {{0, 1}, {0, 2}, {3, 4}, {2, 3}};
        System.out.println(g3.makeConnected(5, arr));
    }

    public int makeConnected(int n, int[][] connections) {
        int arr[] = new int[n];
        Arrays.fill(arr, -1);
        int sum = 0;
        for (int i = 0; i < connections.length; i++) {
            int start = connections[i][0];
            int end = connections[i][1];
            int c1 = help(arr, start);
            int c2 = help(arr, end);
            if (c1 == c2) {
                sum++;
            } else {
                arr[c1] = c2;
            }
        }
        int cluster = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                cluster++;
                if (cluster > sum) {
                    return -1;
                }
            }
        }
        return cluster;

    }

    public int help(int arr[], int id) {
        if (arr[id] == -1) {
            return id;
        } else {
            return help(arr, arr[id]);
        }
    }
}
