package com.ji.algo.G1124;/*
    user ji
    data 2019/11/24
    time 10:28 AM
*/

public class G1 {
    public static void main(String[] args) {

    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 1; i < points.length; i++) {
            count += Math.max(Math.abs(points[i][0] - points[i - 1][0]), Math.abs(points[i][1] - points[i - 1][1]));
        }
        return count;
    }
}
