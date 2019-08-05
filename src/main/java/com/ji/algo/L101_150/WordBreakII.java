package com.ji.algo.L101_150;/*
    user ji
    data 2019/8/5
    time 1:30 PM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakII {
    public static void main(String[] args) {
        WordBreakII wordBreakII = new WordBreakII();
        List<String> list = Arrays.asList("leet", "code");
        System.out.println(wordBreakII.wordBreak("leetcode", list));
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
}
