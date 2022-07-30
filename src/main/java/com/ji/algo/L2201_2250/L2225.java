package com.ji.algo.L2201_2250;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/30/下午9:35
 */
public class L2225 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> loser = new HashMap<>();
        Map<Integer, Integer> winner = new HashMap<>();
        Map<Integer, Integer> all = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            int win = matches[i][0];
            int los = matches[i][1];
            winner.put(win, winner.getOrDefault(win, 0) + 1);
            loser.put(los, loser.getOrDefault(los, 0) + 1);
            all.put(win, all.getOrDefault(win, 0) + 1);
            all.put(los, all.getOrDefault(los, 0) + 1);
        }
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> winn = new LinkedList<>();
        List<Integer> lose = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : winner.entrySet()
        ) {
            if (entry.getValue().equals(all.get(entry.getKey()))) {
                winn.add(entry.getKey());
            }
        }
        Collections.sort(winn);
        res.add(winn);
        for (Map.Entry<Integer, Integer> entry : loser.entrySet()
        ) {
            if (entry.getValue().equals(1)) {
                lose.add(entry.getKey());
            }
        }
        Collections.sort(lose);
        res.add(lose);

        return res;
    }
}
