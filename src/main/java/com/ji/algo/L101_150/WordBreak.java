package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 4:43 PM
*/

import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cats","dog","sand","and","cat");
        new WordBreak().wordBreak("catsandog",list);
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String,Integer> map = new HashMap<>();
        for (String tmp:wordDict
             ) {
            map.put(tmp,1);
        }
        // 可以类比于背包问题
        int n = s.length();
        // memo[i] 表示 s 中以 i - 1 结尾的字符串是否可被 wordDict 拆分
        boolean[] memo = new boolean[n + 1];
        memo[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (memo[j] && map.containsKey(s.substring(j, i))) {
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[n];
    }
}
