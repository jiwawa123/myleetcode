package com.ji.algo.L2351_2400;

import com.ji.algo.game.G0217.L;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/14/下午3:34
 */
public class L2368 {
    public static void main(String[] args) {
        L2368 l2368 = new L2368();
        int[][] arr = {{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}};
        int[] r = {4, 5};
        l2368.reachableNodes(7, arr, r);
    }

    Set<Integer>[] node;
    Set<Integer> res = new HashSet<>();
    Set<Integer> ex = new HashSet<>();

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        node = new HashSet[n];
        for (int i = 0; i < n; i++) {
            node[i] = new HashSet<>();
        }
        for (int i = 0; i < edges.length; i++) {
            node[edges[i][0]].add(edges[i][1]);
            node[edges[i][1]].add(edges[i][0]);
        }
        for (int e : restricted
        ) {
            ex.add(e);
        }
        help(0);
        return res.size();
    }

    public void help(int n) {
        if (ex.contains(n) || res.contains(n)) {
            return;
        }
        res.add(n);
        for (int t : node[n]
        ) {
            help(t);
        }
    }
}
