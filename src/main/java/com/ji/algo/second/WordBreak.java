package com.ji.algo.second;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * user ji
 * data 2020/6/25
 * time 8:33 上午
 */
public class WordBreak {
    public static void main(String[] args) {
        String res = "catsandog";
        List<String> list = Arrays.asList("apple", "pen");
        System.out.println(wordBreak(res, list));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || wordDict == null || wordDict.size() == 0)
            return false;
        int len = s.length();
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < wordDict.size(); i++) {
            map.put(wordDict.get(i), 0);
            max = Math.max(max, wordDict.get(i).length());
        }

        boolean flag[] = new boolean[len + 1];
        flag[0] = true;
        for (int i = 0; i < s.length(); i++) {
            if (!flag[i]) {//前面不能匹配
                continue;
            }
            for (int j = i + 1; j <= i + max && j <= s.length(); j++) {
                if (map.containsKey(s.substring(i, j))) {
                    flag[j] = true;
                }
            }
        }
        return flag[len];
    }
}
