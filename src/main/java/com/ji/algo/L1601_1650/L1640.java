package com.ji.algo.L1601_1650;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/11/12
 * time 8:48 下午
 */
public class L1640 {
    public static void main(String[] args) {
        int arr[] = {12};
        int tmp[][] = {{1}};
        System.out.println(new L1640().canFormArray(arr, tmp));
    }

     Map<Integer, Integer> map = new HashMap<>();

    public boolean canFormArray(int[] arr, int[][] pieces) {
        if (!isContainsAll(arr, pieces))
            return false;
        for (int i = 0; i < pieces.length; i++) {
            int tmp[] = pieces[i];
            if (tmp.length < 2)
                continue;
            int index = map.get(tmp[0]);
            for (int j = 1; j < tmp.length; j++) {
                if (index + 1 != map.get(tmp[j])) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }

    public boolean isContainsAll(int[] arr, int[][] pieces) {

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int count = 0;
        for (int array[] : pieces
        ) {
            for (int t : array
            ) {
                count++;
                if (!map.containsKey(t))
                    return false;
            }
        }
        return count == arr.length;
    }
}
