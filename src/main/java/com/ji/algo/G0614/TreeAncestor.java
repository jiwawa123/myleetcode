package com.ji.algo.G0614;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.log;

/**
 * user ji
 * data 2020/6/14
 * time 10:45 上午
 */
public class TreeAncestor {

    public static void main(String[] args) {
        int arr[] = {-1, 0, 0, 1, 1, 2, 2};
        TreeAncestor tree = new TreeAncestor(7, arr);
        System.out.println(tree.getKthAncestor(3, 1));
        System.out.println(tree.getKthAncestor(5, 2));
        System.out.println(tree.getKthAncestor(5, 1));
        System.out.println(tree.getKthAncestor(6, 3));
    }

    int n;
    int path[];

    public TreeAncestor(int n, int[] parent) {
        this.n = n;
        this.path = parent;
    }

    Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

    public int getKthAncestor(int node, int k) {
        if (k > n)
            return -1;
        if (map.containsKey(node) && map.get(node).containsKey(k))
            return map.get(node).get(k);
        int first = node;
        int index = 0;
        while (node != -1 && k > 0) {
            node = path[node];
            k--;
            index++;
            Map<Integer, Integer> inter = new HashMap<>();
            inter.put(index, node);
            map.put(first, inter);
            if (map.containsKey(node) && map.get(node).containsKey(k))
                return map.get(node).get(k);
        }

        if (k > 0)
            return -1;
        return node;
    }
}
