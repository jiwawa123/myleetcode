package com.ji.algo.G0202;/*
    user ji
    data 2020/2/2
    time 10:26 AM
*/

import java.util.*;

public class G1 {
    public static void main(String[] args) {

    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0)
                    break;
                count++;
            }
            map.put(i, count);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() != o2.getValue()) {
                    return o1.getValue() - o2.getValue();
                }
                return o1.getKey() - o2.getKey();
            }

        });
        int arr[] = new int[k];
        int index = 0;
        for (Map.Entry<Integer, Integer> mapping : list) {
            arr[index++] = mapping.getKey();
            if (index == k)
                break;
        }

        return arr;
    }
}
