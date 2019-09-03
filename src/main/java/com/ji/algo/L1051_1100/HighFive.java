package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/9/3
    time 8:19 AM
*/

import java.util.*;

public class HighFive {
    public static void main(String[] args) {

    }

    public List<int[]> highFive(int arr[][]) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int tmp[] = arr[i];
            if (map.containsKey(tmp[0])) {
                map.get(tmp[0]).add(tmp[1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(tmp[1]);
                map.put(tmp[0], list);
            }
        }
        List<int[]> res = new ArrayList<>();
        for (int t : map.keySet()
                ) {
            List<Integer> inter = map.get(t);
            int count = 0;
            Collections.sort(inter);
            for (int i = inter.size() - 1; i >= inter.size() - 5; i--) {
                count += inter.get(i);
            }
            int aver[] = {t, count / 5};
            res.add(aver);
        }
        return res;
    }
}
