package com.ji.algo.L901_950;/*
    user ji
    data 2019/8/25
    time 8:42 AM
*/

import java.util.HashMap;
import java.util.Map;

public class TotalFruit {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 2};
        System.out.println(totalFruit(arr));
    }

    public static int totalFruit(int[] tree) {
        int max = 0;
        for (int i = 0; i < tree.length; ) {
            if (tree.length - i < max)
                break;
            int count = 1;
            int j;
            int index = i;
            Map<Integer, Integer> map = new HashMap<>();
            map.put(tree[i], 1);
            for (j = i + 1; j < tree.length; j++) {
                if (!map.containsKey(tree[j])&&index==i) {
                    index = j;
                }
                map.put(tree[j], 1);
                if (map.size() > 2)
                    break;
                count++;
            }
            if (index == i) {
                i = j;
            } else {
                i = index;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
