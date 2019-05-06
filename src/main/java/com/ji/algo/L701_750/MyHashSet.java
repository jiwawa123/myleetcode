package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/6
    time 9:12 PM
*/

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    List<Integer> list = new ArrayList<>();
    boolean[] map = new boolean[1000005];
    public MyHashSet() {

    }

    public void add(int key) {
        map[key] = true;
    }

    public void remove(int key) {
        map[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return map[key] == true;
    }
}
