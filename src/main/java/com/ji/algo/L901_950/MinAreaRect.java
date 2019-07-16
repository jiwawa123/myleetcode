package com.ji.algo.L901_950;/*
    user ji
    data 2019/7/12
    time 2:48 PM
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinAreaRect {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,2},{1,3},{5,5},{2,0},{4,5},{3,4},{1,4},{1,5},{0,0},{0,5},{0,4},{4,2},{3,5},{5,2},{2,4},{4,0}};
        //int arr[][] = {{1, 1}, {1, 3}, {3, 1}, {3, 3}};
        System.out.println(new MinAreaRect().minAreaRect(arr));
    }
     int area = Integer.MAX_VALUE;
    public int minAreaRect(int[][] points) {
        Map<Integer, Set<Integer>> map=new HashMap<>();
        for (int[] p:points)
        {
            if(!map.containsKey(p[0]))map.put(p[0],new HashSet<>());
            map.get(p[0]).add(p[1]);
        }
        int res=Integer.MAX_VALUE;
        for (int[] p1:points)
        {
            for (int[] p2:points)
            {
                if(p1[0]==p2[0]||p1[1]==p2[1])continue;
                if(map.get(p1[0]).contains(p2[1])&&map.get(p2[0]).contains(p1[1]))
                {
                    res=Math.min(res,Math.abs(p1[0]-p2[0])*Math.abs(p1[1]-p2[1]));
                }
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}

