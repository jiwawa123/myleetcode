package com.ji.algo.L851_900;/*
    user ji
    data 2019/7/13
    time 11:54 AM
*/

import java.util.HashMap;
import java.util.Map;

public class RobotSim {
    public static void main(String[] args) {
        int arr[][] = {{-3, 2}, {-2, 1}, {0, 1}, {-2, 4}, {-1, 0}, {-2, -3}, {0, -3}, {4, 4}, {-3, 3}, {2, 2}};
        int tmp[] = {7, -2, -2, 7, 5};

        System.out.println(robotSim(tmp, arr));
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
        int row = 0;
        int col = 0;
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < obstacles.length; i++) {
            Map<Integer, Integer> tmp = map.getOrDefault(obstacles[i][0], new HashMap<>());
            tmp.put(obstacles[i][1], 1);
            map.put(obstacles[i][0], tmp);
        }
        int flag = 0;
        int res = 0;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case -1:
                    if (flag == 0) {
                        flag = 1;
                        break;
                    }
                    if (flag == 1) {
                        flag = -2;
                        break;
                    }
                    if (flag == -2) {
                        flag = -1;
                        break;
                    }
                    if (flag == -1) {
                        flag = 0;
                        break;
                    }
                case -2:
                    if (flag == 0) {
                        flag = -1;
                        break;
                    }
                    if (flag == -1) {
                        flag = -2;
                        break;
                    }
                    if (flag == -2) {
                        flag = 1;
                        break;
                    }
                    if (flag == 1) {
                        flag = 0;
                        break;
                    }
                default:
                    int step = commands[i];
                    if (flag == 0) {
                        while (step > 0) {
                            if (map.containsKey(row) && map.get(row).containsKey(col + 1))
                                break;
                            col += 1;
                            step--;
                        }
                        break;
                    }
                    if (flag == -2) {
                        while (step > 0) {
                            if (map.containsKey(row) && map.get(row).containsKey(col-1))
                                break;
                            col -= 1;
                            step--;
                        }
                        break;
                    }
                    if (flag == -1) {
                        while (step > 0) {
                            if (map.containsKey(row-1) && map.get(row-1).containsKey(col))
                                break;
                            row -= 1;
                            step--;
                        }
                        break;

                    }
                    if (flag == 1) {
                        while (step > 0) {
                            if (map.containsKey(row + 1) && map.get(row + 1).containsKey(col))
                                break;
                            row += 1;
                            step--;
                        }
                        break;
                    }
                    break;
            }
            res = Math.max(res,row * row + col * col);
        }
        return res;
    }
}
