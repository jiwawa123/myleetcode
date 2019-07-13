package com.ji.algo.L651_700;/*
    user ji
    data 2019/7/13
    time 5:18 PM
*/

import com.ji.algo.Util.ListNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MagicDictionary {
    /**
     * Initialize your data structure here.
     */
    Map<Integer, List<String>> map;

    public MagicDictionary() {
        map = new HashMap<>();
    }

    /**
     * Build a dictionary through a list of words
     */
    public void buildDict(String[] dict) {
        for (int i = 0; i < dict.length; i++) {
            List<String> tmp = map.getOrDefault(dict[i].length(), new LinkedList<>());
            tmp.add(dict[i]);
            map.put(dict[i].length(), tmp);
        }

    }

    /**
     * Returns if there is any word in the trie that equals to the given word after modifying exactly one character
     */
    public boolean search(String word) {
        int len = word.length();
        if (!map.containsKey(len))
            return false;
        List<String> l = map.get(len);
        for (int i = 0; i < l.size(); i++) {

            int count = 0;
            String tmp = l.get(i);
            if (tmp.equals(word))
                continue;
            for (int j = 0; j < word.length(); j++) {
                if (tmp.charAt(j) != word.charAt(j))
                    count++;
                if (count >= 2)
                    break;
            }
            if (count == 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String word[] = {"hello"};
        MagicDictionary mg = new MagicDictionary();
        mg.buildDict(word);
        System.out.println(mg.search("hhllo"));
    }
}
