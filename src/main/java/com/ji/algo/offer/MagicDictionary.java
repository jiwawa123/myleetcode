package com.ji.algo.offer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/09/13:15
 */
public class MagicDictionary {
    /**
     * Initialize your data structure here.
     */

    Map<Integer, List<String>> map;

    public MagicDictionary() {
        map = new HashMap<>();
    }

    public void buildDict(String[] dictionary) {
        for (String str : dictionary) {
            List<String> res = map.getOrDefault(str.length(), new LinkedList<>());
            res.add(str);
            map.put(str.length(), res);
        }
    }

    public boolean search(String searchWord) {
        List<String> words = map.getOrDefault(searchWord.length(), new LinkedList<>());
        for (String word : words) {
            if (isMatch(word, searchWord)) {
                return true;
            }
        }
        return false;
    }

    public boolean isMatch(String res, String res1) {
        int count = 0;
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) != res1.charAt(i)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return count == 1;
    }
}
