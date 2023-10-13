package com.ji.ready202309;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/07/20:13
 */
public class Trie {
    public Trie() {
        set = new HashSet<>();
        map = new HashMap<>();
    }

    Set<String> set;
    Map<String, Integer> map;

    public void insert(String word) {
        if (map.containsKey(word)) {
            return;
        }
        for (int i = 0; i < word.length(); i++) {
            set.add(word.substring(0, i + 1));
        }
        map.put(word, 1);
    }

    public boolean search(String word) {
        return map.containsKey(word);
    }

    public boolean startsWith(String prefix) {
        return set.contains(prefix);
    }
}
