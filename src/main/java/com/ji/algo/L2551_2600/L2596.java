package com.ji.algo.L2551_2600;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/01/09:52
 */
public class L2596 {
    public static void main(String[] args) {
        int[][] arr = {{0, 11, 16, 5, 20}, {17, 4, 19, 10, 15}, {12, 1, 8, 21, 6}, {3, 18, 23, 14, 9}, {24, 13, 2, 7, 22}};
        System.out.println(checkValidGrid(arr));
    }

    public static boolean checkValidGrid(int[][] grid) {
        int len = grid.length;
        int index = 0;
        if (grid[0][0] != 0) {
            return false;
        }
        int col = 0, row = 0;
        while (index < len * len) {
            // 8个位置进行处理
            if (col + 2 < len && row + 1 < len) {
                if (grid[row + 1][col + 2] == index + 1) {
                    index++;
                    col += 2;
                    row += 1;
                    continue;
                }
            }

            if (col + 2 < len && row - 1 >= 0) {
                if (grid[row - 1][col + 2] == index + 1) {
                    index++;
                    col += 2;
                    row -= 1;
                    continue;
                }
            }

            if (col - 2 >= 0 && row + 1 < len) {
                if (grid[row + 1][col - 2] == index + 1) {
                    index++;
                    col -= 2;
                    row += 1;
                    continue;
                }
            }

            if (col - 2 >= 0 && row - 1 >= 0) {
                if (grid[row - 1][col - 2] == index + 1) {
                    index++;
                    col -= 2;
                    row -= 1;
                    continue;
                }
            }


            if (col + 1 < len && row + 2 < len) {
                if (grid[row + 2][col + 1] == index + 1) {
                    index++;
                    col += 1;
                    row += 2;
                    continue;
                }
            }

            if (col + 1 < len && row - 2 >= 0) {
                if (grid[row - 2][col + 1] == index + 1) {
                    index++;
                    col += 1;
                    row -= 2;
                    continue;
                }
            }

            if (col - 1 >= 0 && row + 2 < len) {
                if (grid[row + 2][col - 1] == index + 1) {
                    index++;
                    col -= 1;
                    row += 2;
                    continue;
                }
            }

            if (col - 1 >= 0 && row - 2 >= 0) {
                if (grid[row - 2][col - 1] == index + 1) {
                    index++;
                    col -= 1;
                    row -= 2;
                    continue;
                }
            }
            if (index == len * len - 1) {
                return true;
            }
            return false;
        }
        return true;
    }
}
