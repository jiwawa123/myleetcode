package com.ji.algo.G0807;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/07/下午2:56
 */
public class L6141 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < items1.length; i++) {
            map.put(items1[i][0], items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            map.put(items2[i][0], map.getOrDefault(items2[i][0], 0) + items2[i][1]);
        }
        List<List<Integer>> res = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> tmp = new LinkedList<>();
            tmp.add(entry.getKey());
            tmp.add(entry.getValue());
            res.add(tmp);

        }
        return res;
    }
}
