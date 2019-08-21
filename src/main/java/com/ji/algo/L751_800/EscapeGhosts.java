package com.ji.algo.L751_800;/*
    user ji
    data 2019/8/21
    time 2:10 PM
*/

public class EscapeGhosts {
    public static void main(String[] args) {

    }

    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int distance = Math.abs(target[0]) + Math.abs(target[1]);
        for (int i = 0; i < ghosts.length; i++) {
            int dis = Math.abs(ghosts[i][0] - target[0]) + Math.abs(ghosts[i][1] - target[1]);
            if (dis >= distance)
                return false;
        }
        return true;
    }

}
