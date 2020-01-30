package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/29
    time 5:32 PM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayRank {
    public static void main(String[] args) {
        int arr[] = {37, 12, 5, 12, 9};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        int res[] = new int[len];
        int tmp[] = Arrays.copyOfRange(arr, 0, len);
        Arrays.sort(tmp);
        int index = 1;
        int last = tmp[0];
        for (int i = 0; i < len; i++) {
            if (last == tmp[i]) {
                map.put(last, index);
            } else {
                index += 1;
                last = tmp[i];
                map.put(last, index);
            }
        }
        for (int i = 0; i < len; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
