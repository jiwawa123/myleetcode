package com.ji.algo.L501_550;/*
    user ji
    data 2019/6/17
    time 10:31 AM
*/

public class FindCircleNum {
    public static void main(String[] args) {
        int arr[][] = {{1,0,0,1},
                        {0,1,1,0},
                        {0,1,1,1},
                        {1,0,1,1}};

    }

    public int findCircleNum(int[][] M) {
        /**
         使用一个visited数组, 依次判断每个节点, 如果其未访问, 朋友圈数加1并对该节点进行dfs搜索标记所有访问到的节点
         **/
        boolean[] visited = new boolean[M.length];
        int ret = 0;
        for(int i = 0; i < M.length; ++i) {
            if(!visited[i]) {
                dfs(M, visited, i);
                ret++;
            }
        }
        return ret;
    }

    private void dfs(int[][] m, boolean[] visited, int i) {
        for(int j = 0; j < m.length; ++j) {
            if(m[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(m, visited, j);
            }
        }
    }
}
