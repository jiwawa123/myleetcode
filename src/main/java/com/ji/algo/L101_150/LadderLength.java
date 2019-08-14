package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/17
    time 10:02 AM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LadderLength {
    public static void main(String[] args) {
        String begin = "hot";
        String end = "dog";
        List<String> list = Arrays.asList("hot", "dog", "dot");
        System.out.println(new LadderLength().ladderLength(begin, end, list));
    }

    int count = Integer.MAX_VALUE;

    public int ladderLength(String begin, String end, List<String> wordList) {
        if (wordList.indexOf(end) == -1)
            return 0;
        Map<String, Map<String, Integer>> map = new HashMap<>();
        map.put(begin, new HashMap<>());
        for (int i = 0; i < wordList.size(); i++) {
            if (isChange(begin, wordList.get(i))) {
                map.get(begin).put(wordList.get(i), 1);
            }
        }
        for (int i = 0; i < wordList.size(); i++) {
            map.put(wordList.get(i), new HashMap<>());
            for (int j = 0; j < wordList.size(); j++) {
                if (isChange(wordList.get(i), wordList.get(j))) {
                    map.get(wordList.get(i)).put(wordList.get(j), 1);
                }
            }
        }
        help(begin, map, 1, end, new HashMap<>());
        return count == Integer.MAX_VALUE ? 0 : count;
    }

    public void help(String start, Map<String, Map<String, Integer>> map, int len, String end, Map<String, Integer> path) {
        if (len >= count)
            return;
        path.put(start, 1);
        Map<String, Integer> tmp = map.get(start);
        if (tmp.containsKey(end)) {
            count = Math.min(count, len + 1);
            return;
        }
        for (String s : tmp.keySet()
                ) {
            if (path.containsKey(s))
                continue;
            path.put(s, 1);
            help(s, map, len + 1, end, new HashMap<>(path));
            path.remove(s);
        }
    }


    public boolean isChange(String s, String s1) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s1.charAt(i))
                count++;
            if (count > 1)
                return false;
        }
        return count == 1;
    }

}
