package com.ji.algo.L551_600;/*
    user ji
    data 2019/7/14
    time 7:50 PM
*/

import com.ji.algo.L651_700.MagicDictionary;

import java.util.*;

public class ValidSquare {
    public static void main(String[] args) {
        int a1[] = {1134, -2539};
        int a2[] = {492, -1255};
        int a3[] = {-792, -1897};
        int a4[] = {-150, -3181};
        System.out.println(validSquare(a1, a2, a3, a4));
    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add( (p1[0] - p2[0]) *  (p1[0] - p2[0]) +  (p1[1] - p2[1]) *  (p1[1] - p2[1]));
        tmp.add( (p1[0] - p3[0]) *  (p1[0] - p3[0]) +  (p1[1] - p3[1]) *  (p1[1] - p3[1]));
        tmp.add( (p1[0] - p4[0]) *  (p1[0] - p4[0]) +  (p1[1] - p4[1]) *  (p1[1] - p4[1]));
        tmp.add( (p3[0] - p2[0]) *  (p3[0] - p2[0]) +  (p3[1] - p2[1]) *  (p3[1] - p2[1]));
        tmp.add( (p4[0] - p2[0]) *  (p4[0] - p2[0]) +  (p4[1] - p2[1]) *  (p4[1] - p2[1]));
        tmp.add( (p3[0] - p4[0]) * ( p3[0] - p4[0]) +  (p3[1] - p4[1]) *  (p3[1] - p4[1]));
        Collections.sort(tmp);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tmp.size(); i++) {
            map.put(tmp.get(i), map.getOrDefault(tmp.get(i), 0) + 1);
        }
        if (map.size() != 2)
            return false;
        Integer edge = Integer.MAX_VALUE;
        Integer adj = 0;
        for (Integer t : map.keySet()) {
            edge = Math.min(edge, t);
            adj = Math.max(adj, t);
        }
        if (map.get(edge) != 4 || map.get(adj) != 2 || edge * 2 != adj)
            return false;
        return true;
    }
}
