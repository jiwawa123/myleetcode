package com.ji.algo.L751_800;/*
    user ji
    data 2019/7/23
    time 4:58 PM
*/

import java.util.*;

public class MaxChunksToSortedII {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 1, 0, 0, 0, 1, 0};
        System.out.println(maxChunksToSorted(arr));
    }

    public static int maxChunksToSorted(int[] arr) {
        int count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        int tmp[] = new int[arr.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = arr[i];
        }
        Arrays.sort(tmp);
        for (int i = 0; i < tmp.length; i++) {
            List<Integer> list = map.getOrDefault(tmp[i], new ArrayList());
            list.add(i);
            map.put(tmp[i], list);
        }
        int index = 0;
        int max = arr[0];
        while (index < tmp.length) {
            int maxIndex = getIndex(map, max);
            for (int i = index + 1; i <= maxIndex; i++) {
                if (max <= arr[i]) {
                    max = Math.max(max, arr[i]);
                    maxIndex = getIndex(map, max);
                }
            }
            count++;

            index = maxIndex + 1;
            if (index < tmp.length)
                max = arr[index];
        }
        return count;

    }

    public static int getIndex(Map<Integer, List<Integer>> map, int num) {
        List<Integer> list = map.get(num);
        int tmp = list.remove(0);
        return tmp;
    }
}
