package com.ji.algo.L2201_2250;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/04/10/下午10:51
 */
public class L2248 {
    public List<Integer> intersection(int[][] nums) {
        int[] arr = new int[1001];
        for (int i = 0; i < nums.length; i++) {
            for (int t : nums[i]
            ) {
                arr[t] += 1;
            }
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1001; i++) {
            if(arr[i]==nums.length){
               list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
