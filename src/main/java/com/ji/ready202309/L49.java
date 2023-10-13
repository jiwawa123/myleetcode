package com.ji.ready202309;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/08/08:49
 */
public class L49 {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            System.out.println(s);
            if (map.containsKey(s)) {
                res.get(map.get(s)).add(strs[i]);
            } else {
                List<String> l = new LinkedList<>();
                l.add(strs[i]);
                res.add(l);
                map.put(s, res.size() - 1);
            }
        }
        return res;
    }
}
