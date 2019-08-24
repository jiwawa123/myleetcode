package com.ji.algo.L451_500;/*
    user ji
    data 2019/8/24
    time 7:56 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllWords {
    Map<String, Integer> map = new HashMap<>();
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        for (String tmp : words
                ) {
            map.put(tmp, 1);
        }
        List<String> list = new ArrayList();
        for(String tmp:words){
            if(wordBreak(tmp)){
                list.add(tmp);
            }
        }
        return list;
    }
    public boolean wordBreak(String s) {
        if(s.equals(""))
            return false;
        map.remove(s);
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
        map.put(s, 1);
        return flag[n];
    }
}
