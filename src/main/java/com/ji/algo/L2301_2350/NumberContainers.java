package com.ji.algo.L2301_2350;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/30/下午10:14
 */
public class NumberContainers {

    Map<Integer, Integer> indexMap = new HashMap<>();
    Map<Integer, TreeSet<Integer>> numberMap = new HashMap<>();

    public NumberContainers() {

    }

    public void change(int index, int number) {
        if (indexMap.containsKey(index)) {
            numberMap.get(indexMap.get(index)).remove(index);
            if (numberMap.get(indexMap.get(index)).isEmpty()) {
                numberMap.remove(indexMap.get(index));
            }
        }
        TreeSet<Integer> set = numberMap.getOrDefault(number, new TreeSet<>());
        set.add(index);
        numberMap.put(number, set);
        indexMap.put(index, number);
    }

    public int find(int number) {
        if (numberMap.containsKey(number)) {
            return numberMap.get(number).first();
        }
        return -1;
    }

}
