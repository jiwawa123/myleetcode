package com.ji.new_algo;/*
    user ji
    data 2019/5/29
    time 10:16 AM
*/

import java.util.Arrays;

public class Djset {
    public static void main(String[] args) {
        int arr[][] = {{1}, {2, 3}, {5}, {4}, {5}};
        System.out.println(isCycle(6, arr));
    }

    public static boolean isCycle(int n, int arr[][]) {
        int parent[] = new int[n];
        Arrays.fill(parent, -1);
        for (int i = 0; i < arr.length; i++) {
            int tmp = i;
            int len = 0;
            while (parent[tmp] != -1) {
                tmp = parent[tmp];
                len++;
            }

            for (int j = 0; j < arr[i].length; j++) {
                int tmp_1 = arr[i][j];
                int len_1 = 0;
                while (parent[tmp_1] != -1) {
                    tmp_1 = parent[tmp_1];
                    len_1++;
                }
                if (tmp_1 == tmp)
                    return true;
                else {
                    if (len >= len_1)
                        parent[arr[i][j]] = tmp;
                    else
                        parent[tmp] = tmp_1;
                }
            }
        }
        return false;
    }

}
