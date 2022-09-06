package com.ji.algo.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/02/下午9:14
 */
public class L39 {
    public static void main(String[] args) {
        int[][] arr = {{1}};
        int[][] arr1 = {{7}};
        System.out.println(minimumSwitchingTimes(arr,arr1));
    }

    public static int minimumSwitchingTimes(int[][] source, int[][] target) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = source.length;
        int n = source[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.put(source[i][j], map.getOrDefault(source[i][j], 0) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map.containsKey(target[i][j])) {
                    if (map.get(target[i][j]) >= 1) {
                        map.put(target[i][j], map.get(target[i][j]) - 1);
                    } else {
                        res++;
                    }
                } else {
                    res++;
                }
            }
        }
        return res;
    }
}
