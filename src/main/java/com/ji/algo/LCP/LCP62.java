package com.ji.algo.LCP;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/07/22:35
 */
public class LCP62 {
    public static void main(String[] args) {

    }

    public int transportationHub(int[][] path) {
        int[] inter = new int[1001];
        int[] outer = new int[1001];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < path.length; i++) {
            inter[path[i][1]] += 1;
            outer[path[i][0]] += 1;
        }
        for (int i = 0; i < 1001; i++) {
            if (inter[i] == set.size() - 1 && outer[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
