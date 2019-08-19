package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/19
    time 2:34 PM
*/

import java.util.*;

public class FreqStack {
    private int index;
    private Map<Integer,Integer> map;
    private PriorityQueue<int[]> queue;

    public FreqStack() {
        queue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1])
                {
                    return o2[2]-o1[2];
                }
                return o2[1]-o1[1];
            }
        });
        map=new HashMap<>();
        index=0;
    }

    public void push(int x) {
        int cnt=map.getOrDefault(x,0)+1;
        map.put(x,cnt);
        queue.add(new int[]{x,cnt,index++});
    }

    public int pop() {
        int[] poll = queue.poll();
        map.put(poll[0],poll[1]-1);
        return poll[0];
    }
}
