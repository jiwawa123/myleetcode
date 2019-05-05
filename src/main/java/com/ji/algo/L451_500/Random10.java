package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/5
    time 8:34 PM
*/

import java.util.HashMap;
import java.util.Map;

public class Random10 {
    public static void main(String[] args) {

    }

    public int rand10() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 1);
        map.put(3, 2);
        map.put(5, 3);
        map.put(7, 4);
        map.put(10, 5);
        map.put(15, 6);
        map.put(20, 7);
        map.put(30, 8);
        map.put(42, 9);
        map.put(35, 10);
        int tmp = rand7() * rand7();
        while (!map.containsKey(tmp)) {
            tmp = rand7() * rand7();
        }
        return map.get(tmp);
    }

    public int rand7() {
        return 0;
    }
}
