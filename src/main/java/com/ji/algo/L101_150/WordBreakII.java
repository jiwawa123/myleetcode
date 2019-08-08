package com.ji.algo.L101_150;/*
    user ji
    data 2019/8/5
    time 1:30 PM
*/

import java.util.*;

public class WordBreakII {
    public static void main(String[] args) {
        WordBreakII wordBreakII = new WordBreakII();
        List<String> list = Arrays.asList("cat", "cats", "and", "sand", "dog");
        System.out.println(wordBreakII.wordBreakII("catsanddog", list));
    }


    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Integer> map = new HashMap<>();
        for (String tmp : wordDict
                ) {
            map.put(tmp, 1);
        }
        int n = s.length();
        //可以看作一个背包问题其实是一个动态规划的问题
        boolean flag[] = new boolean[n + 1];
        flag[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (flag[j] && map.containsKey(s.substring(j, i))) {
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[n];
    }

    public List<String> wordBreakII(String s, List<String> wordDict) {
        if(!wordBreak(s,wordDict))
            return new ArrayList<>();
        Map<Integer, Set<String>> map = new HashMap<>();
        Map<String, Integer> word = new HashMap<>();
        int n = s.length();
        for (String tmp : wordDict
                ) {
            word.put(tmp, 1);
        }
        Set<String> zero = new HashSet<>();
        zero.add("");
        map.put(0, zero);
        for (int i = 1; i <= n; i++) {
            map.put(i, new HashSet<>());
            for (int j = 0; j < i; j++) {
                if (map.get(j).size() > 0 && word.containsKey(s.substring(j, i))) {
                    Set<String> tmp = map.get(j);
                    Set<String> kk = map.get(i);
                    for (String last : tmp
                            ) {
                        kk.add((last + " " + s.substring(j, i)).trim());
                    }
                    map.put(i, kk);
                }
            }
        }
        return new ArrayList<>(map.get(n));
    }
}
