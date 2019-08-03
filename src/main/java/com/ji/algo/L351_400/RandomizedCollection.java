package com.ji.algo.L351_400;/*
    user ji
    data 2019/8/3
    time 7:15 PM
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizedCollection {
    List<Integer> list;
    Random rd ;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        list = new ArrayList();
        rd = new Random();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        int tp = list.indexOf(val);
        list.add(val);
        return tp==-1;

    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        int tp = list.indexOf(val);
        if(tp==-1)
            return false;
        list.remove(tp);
        return true;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        int index = rd.nextInt(list.size());
        return list.get(index);
    }
}
