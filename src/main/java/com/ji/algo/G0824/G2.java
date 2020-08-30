package com.ji.algo.G0824;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/8/24
 * time 9:15 上午
 */
public class G2 {
    public static void main(String[] args) {

    }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean flag[] = new boolean[n];
        for (int i = 0; i < edges.size(); i++) {
            List<Integer> edge = edges.get(i);
            flag[edge.get(1)] = true;
        }
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(!flag[i])
                res.add(i);
        }
        return res;
    }
}
