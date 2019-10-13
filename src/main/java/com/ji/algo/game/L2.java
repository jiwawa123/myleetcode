package com.ji.algo.game;/*
    user ji
    data 2019/10/13
    time 10:37 AM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L2 {
    public static void main(String[] args) {
        int arr[][] = {{1, 0}, {0, 1}, {3, 3}};
        int tmp[] = {0, 0};
        new L2().queensAttacktheKing(arr, tmp);
    }

    List<List<Integer>> list = new ArrayList<>();
    Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        for (int i = 0; i < queens.length; i++) {
            if (map.containsKey(queens[i][0])) {
                map.get(queens[i][0]).put(queens[i][1], 1);
            } else {
                map.put(queens[i][0], new HashMap<>());
                map.get(queens[i][0]).put(queens[i][1], 1);
            }
        }
        helpL(king[0] - 1, king[1]);
        helpR(king[0] + 1, king[1]);
        helpL1(king[0], king[1] - 1);
        helpR1(king[0], king[1] + 1);
        helpLL(king[0] + 1, king[1] + 1);
        helpRR(king[0] - 1, king[1] - 1);
        helpLL1(king[0] - 1, king[1] + 1);
        helpRR1(king[0] + 1, king[1] - 1);
        return list;
    }

    public void help(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7)
            return;
        if (map.containsKey(row) && map.get(row).containsKey(col)) {
            List<Integer> ll = new ArrayList<>();
            ll.add(row);
            ll.add(col);
            list.add(ll);
            return;
        }
        help(row - 1, col);
    }

    public void helpL(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7)
            return;
        if (map.containsKey(row) && map.get(row).containsKey(col)) {
            List<Integer> ll = new ArrayList<>();
            ll.add(row);
            ll.add(col);
            list.add(ll);
            return;
        }
        helpL(row - 1, col);
    }

    public void helpR(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7)
            return;
        if (map.containsKey(row) && map.get(row).containsKey(col)) {
            List<Integer> ll = new ArrayList<>();
            ll.add(row);
            ll.add(col);
            list.add(ll);
            return;
        }
        helpR(row + 1, col);
    }

    public void helpL1(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7)
            return;
        if (map.containsKey(row) && map.get(row).containsKey(col)) {
            List<Integer> ll = new ArrayList<>();
            ll.add(row);
            ll.add(col);
            list.add(ll);
            return;
        }
        helpL1(row, col - 1);
    }

    public void helpR1(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7)
            return;
        if (map.containsKey(row) && map.get(row).containsKey(col)) {
            List<Integer> ll = new ArrayList<>();
            ll.add(row);
            ll.add(col);
            list.add(ll);
            return;
        }
        helpR1(row, col + 1);
    }

    public void helpLL(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7)
            return;
        if (map.containsKey(row) && map.get(row).containsKey(col)) {
            List<Integer> ll = new ArrayList<>();
            ll.add(row);
            ll.add(col);
            list.add(ll);
            return;
        }
        helpLL(row + 1, col + 1);
    }

    public void helpRR(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7)
            return;
        if (map.containsKey(row) && map.get(row).containsKey(col)) {
            List<Integer> ll = new ArrayList<>();
            ll.add(row);
            ll.add(col);
            list.add(ll);
            return;
        }
        helpRR(row - 1, col - 1);
    }

    public void helpRR1(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7)
            return;
        if (map.containsKey(row) && map.get(row).containsKey(col)) {
            List<Integer> ll = new ArrayList<>();
            ll.add(row);
            ll.add(col);
            list.add(ll);
            return;
        }
        helpRR1(row - 1, col + 1);
    }

    public void helpLL1(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7)
            return;
        if (map.containsKey(row) && map.get(row).containsKey(col)) {
            List<Integer> ll = new ArrayList<>();
            ll.add(row);
            ll.add(col);
            list.add(ll);
            return;
        }
        helpLL1(row + 1, col - 1);
    }
}
