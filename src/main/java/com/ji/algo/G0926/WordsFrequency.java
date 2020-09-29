package com.ji.algo.G0926;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * user ji
 * data 2020/9/26
 * time 2:40 下午
 */
public class WordsFrequency {
    public Map<String, Integer> map = new HashMap<String, Integer>();

    public List<String> wordsFrequency(String[] book, int m) {
        //统计每个单词出现的次数
        for (String num : book) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        Map<String, Integer> res = map.entrySet()
                .stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new));
        List<String> tmp = new LinkedList<>();
        int index = 0;
        for (Map.Entry<String, Integer> entry : res.entrySet()
        ) {
            tmp.add(entry.getKey());
            index++;
            if (index >= m)
                break;
        }
        return tmp;
    }


}
