package com.ji.algo.G0329;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/3/29
 * time 12:04 PM
 */
public class G1 {
    public static void main(String[] args) {

    }
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max = -1;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
            if(entry.getValue()==entry.getKey())
                max = Math.max(max,entry.getKey());
        }


        return max;
    }
}
