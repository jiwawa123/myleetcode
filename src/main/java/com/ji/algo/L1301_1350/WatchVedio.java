package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/8
    time 3:53 PM
*/

import java.util.*;

public class WatchVedio {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> l1 = Arrays.asList("A", "B");
        List<String> l2 = Arrays.asList("C");
        List<String> l3 = Arrays.asList("B", "C");
        List<String> l4 = Arrays.asList("D");
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        int friends[][] = {{1, 2}, {0, 3}, {0, 3}, {1, 2}};
        List<String> res = new WatchVedio().watchedVideosByFriends(list, friends, 0, 2);
        res.stream().forEach(System.out::println);
    }

    Map<Integer, Integer> step = new HashMap<>();
    Map<String, Integer> vedio = new HashMap<>();
    int path;

    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        List<String> res = new ArrayList<>();
        path = level ;
        helpBFS(watchedVideos, friends, id, 0);
        for (Map.Entry<Integer,Integer> entry:step.entrySet()
                ) {
            if(entry.getValue()==level){
                List<String> videos = watchedVideos.get(entry.getKey());
                for (String str:videos
                        ) {
                    vedio.put(str,vedio.getOrDefault(str,0)+1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(vedio.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() != o2.getValue()) {
                    return o1.getValue() - o2.getValue();
                } else {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });
        for (Map.Entry<String, Integer> map : list
                ) {
            res.add(map.getKey());
        }
        return res;
    }

    public void helpBFS(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        if(level>path)
            return;
        if (step.containsKey(id) && step.get(id) <= level)
            return;
        step.put(id, level);
        //判断第n层
        //这个节点已经遍历
        int friend[] = friends[id];
        for (int t : friend
                ) {
            helpBFS(watchedVideos, friends, t, level +1);
        }
    }
}
