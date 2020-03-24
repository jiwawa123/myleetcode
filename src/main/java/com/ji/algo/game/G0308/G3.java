package com.ji.algo.game.G0308;/*
    user ji
    data 2020/3/8
    time 10:29 AM
*/

import java.util.*;

public class G3 {
    public static void main(String[] args) {

    }

    //广度搜索获取最大值
    int res = 0;
    Map<Integer, List<Integer>> leader = new HashMap<>();
    int[] dep;

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        if (manager.length == 1)
            return 0;
        dep = new int[manager.length];
        dep[headID] = 0;
        for (int i = 0; i < manager.length; i++) {
            List<Integer> tmp = leader.getOrDefault(manager[i], new ArrayList<>());
            tmp.add(i);
            leader.put(manager[i], tmp);
        }
        help(headID, 0, informTime);
        return res;
    }

    public void help(int headId, int haved, int[] infor) {
        dep[haved] = haved;
        res = Math.max(res, haved);
        if (!leader.containsKey(headId))
            return;
        List<Integer> list = leader.get(headId);
        for (int t :list){
            help(t,haved+infor[headId],infor);
        }

    }

}
