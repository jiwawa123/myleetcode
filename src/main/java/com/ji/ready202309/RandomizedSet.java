package com.ji.ready202309;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/11:48
 */
public class RandomizedSet {

    ArrayList<Integer> list;
    Map<Integer, Integer> map;
    Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }


    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        int size = list.size();
        list.add(size, val);
        map.put(val, size);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int last = list.get(list.size() - 1);
        list.set(index, last);
        list.remove(list.size() - 1);
        map.put(last, index);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
