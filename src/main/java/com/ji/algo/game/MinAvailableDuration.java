package com.ji.algo.game;/*
    user ji
    data 2019/10/20
    time 9:12 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAvailableDuration {
    public static void main(String[] args) {
        int arr[][] = {{10, 50}, {60, 120}, {140, 210}};
        int arr1[][] = {{0, 15}, {60, 70}};
        minAvailableDuration(arr, arr1, 12).stream().forEach(System.out::println);
    }
    //顺序执行即可
    public static List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        Arrays.sort(slots1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        Arrays.sort(slots2, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        while (i < slots1.length && j < slots2.length) {
            int s1 = slots1[i][0];
            int e1 = slots1[i][1];
            int s2 = slots2[j][0];
            int e2 = slots2[j][1];
            if (s1 >= e2) {
                j++;
                continue;
            }
            if (s2 >= e1) {
                i++;
                continue;
            }
            int s = Math.max(s1, s2);
            int e = Math.min(e1, e2);
            if (e - s >= duration) {
                res.add(s);
                res.add(s + duration);
                break;
            }
            if (e1 < e2) {
                i++;
            } else {
                j++;
            }
        }

        return res;
    }
}
