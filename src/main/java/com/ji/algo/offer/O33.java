package com.ji.algo.offer;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/30/下午12:11
 */
public class O33 {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String o = String.valueOf(arr);
            List<String> tmp = map.getOrDefault(o, new ArrayList<>());
            tmp.add(strs[i]);
            map.put(o, tmp);

        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> l : map.values()
        ) {
            res.add(l);
        }
        return res;
    }
}
