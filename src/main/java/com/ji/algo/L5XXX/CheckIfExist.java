package com.ji.algo.L5XXX;/*
    user ji
    data 2020/2/10
    time 12:15 PM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfExist {
    public static void main(String[] args) {
        int arr[] = {-20, 8, -6, -14, 0, -19, 14, 4};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0&&map.containsKey(2*arr[i]))
                return true;
            if(arr[i]==0&&map.get(0)>=2)
                return true;
        }
        return false;
    }
}
