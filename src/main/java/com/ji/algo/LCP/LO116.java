package com.ji.algo.LCP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/10/11:24
 */
public class LO116 {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        new LO116().findCircleNum(arr);
    }

    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    int s = find(arr, i);
                    int e = find(arr, j);
                    if (s != e) {
                        arr[i] = e;
                    }
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            set.add(find(arr,i));
        }
        return set.size();
    }


    public int find(int[] arr, int target) {
        while (arr[target] != target) {
            target = arr[target];
        }
        return target;
    }

}
