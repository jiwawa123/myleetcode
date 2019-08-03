package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/3
    time 11:14 AM
*/

import java.util.*;

public class EventualSafeNodes {
    public static void main(String[] args) {
        int arr[][] = {{}, {0, 2, 3, 4}, {3}, {4}, {}};
        System.out.println(new EventualSafeNodes().eventualSafeNodes(arr).size());
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        if(graph.length==0) return ans;
        boolean[] safe = new boolean[graph.length];
        boolean[] visited = new boolean[graph.length];
        for(int x=0;x<graph.length;x++) {
            Arrays.fill(visited, false);
            if(isSafe(graph, x, safe, visited))
                ans.add(x);
        }
        return ans;
    }
    private boolean isSafe(int[][] graph, int x, boolean[] safe, boolean[] visited) {
        if(safe[x]) return true;
        if(visited[x]) return false;
        visited[x] = true;
        if(graph[x].length == 0) {
            safe[x] = true;
            return true;
        }
        for(int i: graph[x])
            if(!isSafe(graph, i, safe, visited))
                return false;
        safe[x] = true;
        return true;
    }

}
