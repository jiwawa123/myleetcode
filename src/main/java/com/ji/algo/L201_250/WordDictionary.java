package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/19
    time 8:21 AM
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordDictionary {
    //使用二级索引
    Map<Integer, Map<Character, Set<String>>> map;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        map = new HashMap<>();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        if (null == word || word.length() == 0)
            return;
        int len = word.length();
//        if (map.containsKey(len)) {
//            Set<String> set = map.get(len);
//            set.add(word);
//            map.put(len, set);
//        } else {
//            Set<String> set = new HashSet<>();
//            set.add(word);
//            map.put(len, set);
//        }
        Map<Character, Set<String>> map1 = map.containsKey(len) ? map.get(len) : new HashMap<>();
        Set<String> set = map1.containsKey(word.charAt(0)) ? map1.get(word.charAt(0)) : new HashSet<>();
        set.add(word);
        map1.put(word.charAt(0), set);
        map.put(len, map1);

    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        if (word == null || !map.containsKey(word.length()))
            return false;
        Map<Character, Set<String>> map1 = map.get(word.length());
        if (word.charAt(0) != '.') {
            if (!map1.containsKey(word.charAt(0))) {
                return false;
            }
            Set<String> set = map1.get(word.charAt(0));
            for (String str : set
                    ) {
                if (isMatch(word, str)) {
                    return true;
                }
            }
        }else{
            for (Set<String> set:map1.values()
                 ) {
                for (String str : set
                        ) {
                    if (isMatch(word, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isMatch(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.' && s.charAt(i) != t.charAt(i))
                return false;
        }
        return true;
    }


}
