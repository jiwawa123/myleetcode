package com.ji.algo.L3001_3050;

import sun.jvm.hotspot.opto.HaltNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/09/11:39
 */
public class L3046 {
    public static void main(String[] args) {

    }

    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            int t = map.getOrDefault(n, 0) + 1;
            map.put(n, t);
            if(t>2){
                return false;
            }
        }
        return true;
    }
}
