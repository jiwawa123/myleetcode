package com.ji.algo.game.G0301;/*
    user ji
    data 2020/3/1
    time 10:29 AM
*/

import java.util.*;

public class G2 {
    public static void main(String[] args) {
        String res[] = {"ABC","ACB","ABC","ACB","ACB"};
        System.out.println(rankTeams(res));
    }

    public static String rankTeams(String[] votes) {
        if (votes.length == 1)
            return votes[0];
        int len = votes[0].length();
        Map<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < votes.length; i++) {
            for (int j = 0; j < votes[i].length(); j++) {
                int[] order = map.getOrDefault(votes[i].charAt(j), new int[len]);
                order[j] += 1;
                map.put(votes[i].charAt(j), order);
            }
        }
        List<Map.Entry<Character, int[]>> list = new ArrayList<Map.Entry<Character, int[]>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, int[]>>() {
            @Override
            public int compare(Map.Entry<Character, int[]> o1, Map.Entry<Character, int[]> o2) {
                int res[] = o1.getValue();
                int res1[] = o2.getValue();
                for (int i = 0; i < res.length; i++) {
                    if (res[i] > res1[i])
                        return -1;
                    if (res[i] < res1[i])
                        return 1;
                }
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        StringBuilder sp = new StringBuilder();
        for (Map.Entry<Character, int[]> entry : list) {
            sp.append(entry.getKey());
        }
        return sp.toString();
    }
}
