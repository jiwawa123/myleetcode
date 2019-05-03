package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/3
    time 8:07 PM
*/

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencySort {
    public static void main(String[] args) {

    }

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        Map<Character, Integer> res = map.entrySet().
                stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        StringBuffer sp = new StringBuffer();
        for (char a : res.keySet()
                ) {
            for (int i = 0; i < res.get(a); i++) {
                sp.append(a);
            }
        }
        return sp.toString();
    }
}
