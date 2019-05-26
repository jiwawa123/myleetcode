package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/26
    time 7:58 PM
*/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {
    public static void main(String[] args) {

    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()!=pattern.length())
                continue;
            if(help(words[i],pattern)){
                list.add(words[i]);
            }
        }

        return list;
    }

    public boolean help(String a, String b) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (!map.containsKey(a.charAt(i)) && !map1.containsKey(b.charAt(i))) {
                map.put(a.charAt(i), b.charAt(i));
                map1.put(b.charAt(i), a.charAt(i));
            }
            if (map.containsKey(a.charAt(i)) && map1.containsKey(b.charAt(i))) {
                if (map.get(a.charAt(i)) == b.charAt(i) && map1.get(b.charAt(i)) == a.charAt(i)) {

                } else {
                    return false;
                }

            } else {
                return false;
            }

        }
        return true;
    }
}
