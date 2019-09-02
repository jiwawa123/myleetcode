package com.ji.algo.L351_400;/*
    user ji
    data 2019/9/2
    time 5:39 PM
*/

import java.util.HashMap;
import java.util.Map;

public class Logger {
    public static void main(String[] args) {

    }

    Map<String, Integer> map = new HashMap<>();

    public boolean shouldPrintMessage(int time, String message) {
        if (map.containsKey(message) && map.get(message) + 10 >= time) {
            map.put(message, time);
            return false;
        } else {
            map.put(message, time);
            return true;
        }
    }

}
