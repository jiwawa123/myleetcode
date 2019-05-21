package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/21
    time 2:17 PM
*/

public class FindJudge {
    public static void main(String[] args) {

    }

    public int findJudge(int N, int[][] trust) {
        int arr[] = new int[N + 1];
        arr[0] = -1;
        for (int i = 0; i < trust.length; i++) {
            arr[trust[i][0]] = -1;
            if (arr[trust[i][1]] == -1) {
                continue;
            } else {
                arr[trust[i][1]] += 1;
            }

        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == N - 1)
                return i;
        }
        return -1;
    }
}
