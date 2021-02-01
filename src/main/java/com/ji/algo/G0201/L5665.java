package com.ji.algo.G0201;

import java.util.*;

/**
 * user ji
 * data 2021/2/1
 * time 10:11 上午
 */
public class L5665 {
    public static void main(String[] args) {
        int arr[][] = {{2, 1}, {3, 4}, {3, 2}};
        int tmp[] = restoreArray(arr);
        System.out.println(Arrays.toString(tmp));
    }

    public static int[] restoreArray(int[][] adjacentPairs) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < adjacentPairs.length; i++) {
            int start = adjacentPairs[i][0];
            int end = adjacentPairs[i][1];
            map.computeIfAbsent(start, k -> new ArrayList<>()).add(end);
            map.computeIfAbsent(end, k -> new ArrayList<>()).add(start);
        }
        int res[] = new int[adjacentPairs.length + 1];
        // 找出头部
        map.forEach((key, value) -> {   //遍历找头
            if (value.size() == 1 && res[0] == res[1]) {       //找到了并防止找到另一头
                res[0] = key;             //前两个特殊值手动添加
                res[1] = value.get(0);
                for (int i = 2; i < res.length; i++) {      //跟随指向持续Hash
                    int nextKey = map.get(res[i - 1]).get(0);   //预设nextKey
                    //纠正反向nextKey
                    res[i] = nextKey != res[i - 2] ? nextKey : map.get(res[i - 1]).get(1);
                }
            }
        });
        return res;
    }
}
