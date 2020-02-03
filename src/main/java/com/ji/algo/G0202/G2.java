package com.ji.algo.G0202;/*
    user ji
    data 2020/2/2
    time 10:26 AM
*/

import java.util.*;

public class G2 {
    public static void main(String[] args) {
        int arr[] = {3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(arr));
    }

    public static int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        int count = 0;
        int len = 0;
        for (Map.Entry<Integer, Integer> mapping : list) {
            len += mapping.getValue();
            count++;
            if (len >= arr.length / 2) {
                break;
            }
        }
        return count;
    }
}
