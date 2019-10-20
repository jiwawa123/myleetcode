package com.ji.algo.game;/*
    user ji
    data 2019/10/20
    time 10:31 AM
*/

public class L1020001 {
    public static void main(String[] args) {
        int arr[][] = {{4, 8}, {-2, 8}, {1, 8}, {8, 8}, {-5, 8}, {0, 8}, {7, 8}, {5, 8}};
        System.out.println(checkStraightLine(arr));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates == null || coordinates.length < 3)
            return true;
        int row = 1, col = 1;
        for (int i = 1; i < coordinates.length; i++) {
            if (coordinates[i][0] == coordinates[0][0])
                row++;
            if (coordinates[i][1] == coordinates[0][1])
                col++;
        }
        if (row == coordinates.length || col == coordinates.length)
            return true;
        double tmp = 1.0 * (coordinates[0][0] - coordinates[1][0]) / (coordinates[0][1] - coordinates[1][1]);
        for (int i = 2; i < coordinates.length; i++) {
            if (tmp != 1.0 * (coordinates[0][0] - coordinates[i][0]) / (coordinates[0][1] - coordinates[i][1])) {
                return false;
            }
        }
        return true;
    }
}
