package com.ji.ready202309;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/07/20:28
 */
public class L207 {
    public static void main(String[] args) {

    }

    int visited[];
    List<List<Integer>> list;
    boolean flag = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        list = new ArrayList<>();
        visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            list.add(new LinkedList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            list.get(prerequisites[i][1]).add(prerequisites[i][1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
        return flag;
    }


    public void dfs(int start) {
        if (!flag) {
            return;
        }
        if (visited[start] == 1) {
            return;
        }
        visited[start] = 1;
        for (int t : list.get(start)
        ) {
            if (visited[t] == 1) {
                flag = false;
                return;
            } else {
                dfs(t);
            }
        }
    }
}
