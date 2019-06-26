package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/26
    time 9:09 AM
*/

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        String arr[] = {"i", "love", "leetcode", "i", "love", "coding"};
        topKFrequent(arr, 2);
    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            //升序排序
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                if (o1.getValue() > o2.getValue())
                    return -1;
                if (o1.getValue() < o2.getValue())
                    return 1;
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        int index = 0;
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> mapping : list
                ) {
            if (index >= k)
                break;
            res.add(mapping.getKey());
            index++;
        }
        return res;
    }
}
