package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/30
    time 4:30 PM
*/

import java.util.ArrayList;
import java.util.List;

public class CanVisitAllRoom {
    public static void main(String[] args) {
        int arr[][] = {{1}, {2}, {3}, {}};
        List<List<Integer>> tmp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> tp = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                tp.add(arr[i][j]);
            }
            tmp.add(tp);
        }
        System.out.println(canVisitAllRooms(tmp));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int flag[] = new int[rooms.size()];
        dfs(rooms, flag, 0);
        flag[0] = 1;
        for (int tmp : flag
                ) {
            if (tmp < 1)
                return false;
        }
        return true;
    }

    public static void dfs(List<List<Integer>> rooms, int flag[], int start) {
        if (flag[start] > 1 || rooms.get(start).size() == 0)
            return;
        List<Integer> tmp = rooms.get(start);
        for (int k : tmp
                ) {
            flag[k] += 1;
            dfs(rooms, flag, k);

        }

    }
}
