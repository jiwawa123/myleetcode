package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/8/21
    time 2:18 PM
*/

import java.util.*;

public class LongestStrChain {
    public static void main(String[] args) {
        String tmp[] = {"ksqvsyq", "ks", "kss", "czvh", "zczpzvdhx", "zczpzvh", "zczpzvhx", "zcpzvh", "zczvh", "gr", "grukmj", "ksqvsq", "gruj", "kssq", "ksqsq", "grukkmj", "grukj", "zczpzfvdhx", "gru"};
        System.out.println(longestStrChain(tmp));
    }

    public static int longestStrChain(String[] words) {
        if (words == null || words.length == 0)
            return 0;
        if (words.length < 2)
            return 1;
        int count = 1;
        Map<Integer, List<String>> map = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            if (map.containsKey(len))
                map.get(len).add(words[i]);
            else {
                List<String> list = new LinkedList();
                list.add(words[i]);
                map.put(len, list);
            }
        }
        int index = 0;
        Map<String, Integer> tmp = new HashMap<>();
        for (int t : map.keySet()
                ) {
            if (map.containsKey(t - 1)) {
                List<String> str = map.get(t - 1);
                List<String> str1 = map.get(t);
                for (int i = 0; i < str1.size(); i++) {
                    for (int j = 0; j < str.size(); j++) {
                        if (help(str1.get(i), str.get(j))) {
                            System.out.println(str1.get(i) + " " + str.get(j));
                            tmp.put(str1.get(i),
                                    Math.max(tmp.getOrDefault(str1.get(i), 1), tmp.getOrDefault(str.get(j), 1) + 1));
                            count = Math.max(count, tmp.get(str1.get(i)));
                        }
                    }
                }
            } else {
                List<String> str = map.get(t);
                for (int i = 0; i < str.size(); i++) {
                    tmp.put(str.get(i), 1);
                }
            }
        }
        return count;
    }

    public static boolean help(String a, String b) {
        int i = 0, j = 0;
        int count = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
                count++;
            }
            if (count > 1)
                return false;
        }
        return true;
    }
}
