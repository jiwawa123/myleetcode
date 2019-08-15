package com.ji.algo.L201_250;/*
    user ji
    data 2019/8/15
    time 4:38 PM
*/

import java.util.HashMap;
import java.util.Map;

public class Tries {
    public static void main(String[] args) {

    }

    Map<String, Integer> map = new HashMap();
    Map<String, Integer> prefix = new HashMap();

    /**
     * Initialize your data structure here.
     */
    public Tries() {

    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (map.containsKey(word))
            return;
        for (int i = word.length(); i >= 0; i--) {
            if (prefix.containsKey(word.substring(0, i)))
                break;
            prefix.put(word.substring(0, i), 1);
        }
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        return map.containsKey(word);
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        return this.prefix.containsKey(prefix);
    }
}
