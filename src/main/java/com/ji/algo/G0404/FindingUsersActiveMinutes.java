package com.ji.algo.G0404;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * user ji
 * data 2021/4/4
 * time 10:21 下午
 */
public class FindingUsersActiveMinutes {
    public static void main(String[] args) {

    }

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int tmp[] = new int[k];
        for (int i = 0; i < logs.length; i++) {
            Set<Integer> set = map.getOrDefault(logs[i][0], new HashSet<>());
            set.add(logs[i][1]);
            map.put(logs[i][0], set);
        }
        for (Map.Entry<Integer, Set<Integer>> en : map.entrySet()
        ) {
            if (en.getValue().size() > k)
                continue;
            tmp[en.getValue().size() - 1] += 1;
        }
        return tmp;
    }
}
