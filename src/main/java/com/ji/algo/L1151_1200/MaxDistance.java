package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/9/3
    time 10:12 AM
*/

import java.util.LinkedList;
import java.util.Queue;

public class MaxDistance {
    public static void main(String[] args) {

    }

    public int maxDistance(int[][] grid) {
        Queue<Point> q = new LinkedList<>();
        int N = grid.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new Point(i, j));
                }
            }
        }
        //全为陆地或者全为海水的情况 return -1
        //在使用广度遍历的时候优先考虑使用队列，这个比较方便。
        if (q.size() == N * N || q.isEmpty()) return -1;
        int val = 1;
        int[] X = new int[]{0, -1, 1, 0};
        int[] Y = new int[]{1, 0, 0, -1};
        while (!q.isEmpty()) {
            Point point = q.poll();
            int x = point.x;
            int y = point.y;
            val = grid[x][y];
            //分别寻找当前点的上下左右
            for (int i = 0; i < 4; i++) {
                int nextX = x + X[i];
                int nextY = y + Y[i];
                //坐标越界  continue
                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= N) continue;
                if (grid[nextX][nextY] == 0) {
                    //因为是优先从队首取坐标将相邻的点的值更新，更新后的值就是该点距其他点最小的曼哈顿距离+1
                    grid[nextX][nextY] = val + 1;
                    q.offer(new Point(nextX, nextY));
                }
            }
        }
        return val - 1;
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
