package com.ji.algo.G0614;

import java.util.*;

/**
 * user ji
 * data 2020/6/14
 * time 10:17 上午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = {4, 3, 1, 1, 3, 3, 2};
        System.out.println(findLeastNumOfUniqueInts(arr, 3));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        int res = map.size();
        for (Map.Entry<Integer, Integer> mapping : list
        ) {
            if (mapping.getValue() > k) {
                break;
            }
            k -= mapping.getValue();
            res--;
        }
        return res;
    }
}
