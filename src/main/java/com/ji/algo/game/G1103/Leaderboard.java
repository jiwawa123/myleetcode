package com.ji.algo.game.G1103;/*
    user ji
    data 2019/11/3
    time 5:33 PM
*/

import java.util.*;

public class Leaderboard {

    Map<Integer, Map<Integer, Integer>> map;
    Map<Integer, Integer> user = new HashMap<>();

    public Leaderboard() {
        map = new TreeMap<Integer, Map<Integer, Integer>>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });
    }

    public void addScore(int playerId, int score) {
        int s = 0;
        if (user.containsKey(playerId)) {
            s = user.get(playerId);
            user.put(playerId, s + score);
            map.get(s).remove(playerId);
            Map<Integer, Integer> m = map.getOrDefault(s + score, new HashMap<>());
            m.put(playerId, 1);
            map.put(s + score, m);
        } else {
            user.put(playerId, score);
            Map<Integer, Integer> m = map.getOrDefault(score, new HashMap<>());
            m.put(playerId, 1);
            map.put(s + score, m);
        }
    }

    public int top(int K) {
        int count = 0;
        int sum = 0;
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : map.entrySet()
                ) {
            if (entry.getValue().size() >= K - count) {
                sum += entry.getKey() * (K - count);
                break;
            } else {
                count += entry.getValue().size();
                sum += entry.getKey() * entry.getValue().size();
            }
        }
        return sum;
    }

    public void reset(int playerId) {
        int s = user.get(playerId);
        user.remove(playerId);
        map.get(s).remove(playerId);
    }

    public static void main(String[] args) {
        Leaderboard leaderboard = new Leaderboard();
        leaderboard.addScore(1,73);
        leaderboard.addScore(2,56);
        leaderboard.addScore(3,39);
        leaderboard.addScore(4,51);
        leaderboard.addScore(5,4);
        System.out.println(leaderboard.top(1));
        leaderboard.reset(1);
        leaderboard.reset(2);
        leaderboard.addScore(2,51);
        System.out.println(leaderboard.top(3));
    }
}
