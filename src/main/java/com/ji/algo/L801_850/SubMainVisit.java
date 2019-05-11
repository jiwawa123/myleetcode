package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/11
    time 9:26 PM
*/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SubMainVisit {
    public static void main(String[] args) {

    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {

            String arr[] = cpdomains[i].split(" ");
            String tmp = arr[1];
            while (tmp.indexOf(".") != -1) {
                map.put(tmp, map.getOrDefault(tmp, 0) + Integer.valueOf(arr[0]));
                tmp = tmp.substring(tmp.indexOf(".") + 1);
            }
            map.put(tmp, map.getOrDefault(tmp, 0) + Integer.valueOf(arr[0]));
        }
        List<String> list = new LinkedList<>();
        for (String key : map.keySet()
                ) {
            list.add(map.get(key) + " " + key);
        }
        return list;
    }
}
