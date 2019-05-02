package com.ji.algo.L301_350;/*
    user ji
    data 2019/5/2
    time 2:00 PM
*/

import java.util.*;
import java.util.stream.Collectors;

public class TopFrequency {
    public static void main(String[] args) {

    }

    public List<Integer> topKFrequent(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Map<Integer, Integer> result = map.entrySet().parallelStream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        List<Integer> list = new ArrayList<>();
        for (int kk : result.keySet()
                ) {
            if (list.size() == k)
                break;
            list.add(kk);
        }
        return list;
    }


}
