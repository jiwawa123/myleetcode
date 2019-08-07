package com.ji.algo.L601_650;/*
    user ji
    data 2019/8/7
    time 12:29 PM
*/

import java.util.*;

public class FindLongestChain {
    public static void main(String[] args) {

    }

    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0)
            return 0;
        if (pairs.length == 1)
            return 1;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < pairs.length; i++) {
            list.add(pairs[i]);
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[list.size()];
        arr[0] = 1;
        int end = list.get(0)[1];
        map.put(1, end);
        int max = 1;
        for (int i = 1; i < list.size(); i++) {
            int p[] = list.get(i);
            int tmp = max;
            while (tmp > 0) {
                if (p[0] > map.get(tmp)) {
                    break;
                }
                tmp--;
            }
            arr[i] = tmp + 1;
            if (map.containsKey(tmp + 1)) {
                map.put(tmp + 1, Math.min(map.get(tmp + 1), p[1]));
            } else {
                map.put(tmp + 1, p[1]);
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
