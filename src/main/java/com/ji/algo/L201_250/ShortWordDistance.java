package com.ji.algo.L201_250;/*
    user ji
    data 2019/8/29
    time 8:28 PM
*/

import java.util.Arrays;
import java.util.List;

public class ShortWordDistance {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("practice", "makes", "perfect", "coding", "makes");
        System.out.println(distance("coding","practice",list));
        System.out.println(distance("makes","coding",list));
        System.out.println(distance("practice","perfect",list));
    }
    //使用双指针即可实现 最短距离的计算
    public static int distance(String word1, String word2, List<String> list) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while (i < list.size() && j < list.size()) {
            if (!list.get(i).equals(word1) && !list.get(j).equals(word2)) {
                i++;
                j++;
                continue;
            }
            if (list.get(i).equals(word1) && list.get(j).equals(word2)) {
                min = Math.min(min, Math.abs(i - j));
                if (i < j) {
                    i++;
                } else {
                    j++;
                }
                continue;
            }
            if (list.get(i).equals(word1)) {
                j++;
                continue;
            }
            if (list.get(j).equals(word2)) {
                i++;
                continue;
            }
        }
        return min;
    }
}
