package com.ji.algo.game.G0112;/*
    user ji
    data 2020/1/12
    time 10:27 AM
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class G3 {
    public static void main(String[] args) {
        G3 g3 = new G3();
        int arr[][] = {{0,1},{0,2},{3,4},{2,3}};
        System.out.println(g3.makeConnected(5,arr));
    }

    Map<Integer, Set<Integer>> map = new HashMap<>();
    int sum = 0;

    public int makeConnected(int n, int[][] connections) {
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(i);
            map.put(i, set);
        }
        for (int i = 0; i < connections.length; i++) {
            int start = connections[i][0];
            int end = connections[i][1];
            int c1 = find(start);
            int c2 = find(end);
            if (c1 != c2) {
                combine(c1, c2);
            } else {
                sum++;
            }
        }
        if (sum >= map.size() - 1) {
            return map.size() - 1;
        }
        return -1;
    }

    //查询当前的信息所在的位置
    public int find(int id) {
        for (Map.Entry<Integer, Set<Integer>> tmp : map.entrySet()) {
            if (tmp.getValue().contains(id)) {
                return tmp.getKey();
            }
        }
        return 0;
    }

    //遇到能合并的就合并即可
    public void combine(int c1, int c2) {
        Set<Integer> set1 = map.get(c1);
        map.remove(c1);
        for (int id : set1
                ) {
            map.get(c2).add(id);
        }
    }


}
