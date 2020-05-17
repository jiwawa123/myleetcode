package com.ji.algo.G0517;

import java.util.*;

/**
 * user ji
 * data 2020/5/17
 * time 4:49 下午
 */
public class G3 {
    public static void main(String[] args) {

    }

    // 倒排索引 思路解决
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        Map<String, Set<Integer>> map = new HashMap<>();
        List<Integer> res = new LinkedList<>();
        // 将每个单词进行索引创建
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            for (String tmp : favoriteCompanies.get(i)
            ) {
                Set<Integer> set = map.getOrDefault(tmp, new HashSet<>());
                set.add(i);
                map.put(tmp, set);
            }
        }
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            if (isExist(favoriteCompanies.get(i), map)) {
                res.add(i);
            }

        }

        return res;
    }

    public boolean isExist(List<String> words, Map<String, Set<Integer>> map) {
        Set<Integer> all = new HashSet<>();
        for (String word : words
        ) {
            Set<Integer> set = map.get(word);
            if (set.size() == 1)
                return true;
            if (all.size() == 0) {
                all = new HashSet<>(set);
            } else {
                all.retainAll(set);
            }
        }
        return all.size() == 1;
    }
}
