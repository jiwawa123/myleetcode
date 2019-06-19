package com.ji.algo.L251_300;/*
    user ji
    data 2019/6/19
    time 8:23 AM
*/

public class GameOfLife {
    public static void main(String[] args) {

    }

    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0)
            return;
        int row = board.length;
        int col = board[0].length;
        int tmp[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int l = 0;
                int d = 0;
                //上
                if (i > 0) {
                    l += board[i - 1][j];
                    if (board[i - 1][j] == 0) {
                        d++;
                    }
                }
                //左
                if (j > 0) {
                    l += board[i][j - 1];
                    if (board[i][j - 1] == 0) {
                        d++;
                    }
                }
                //下
                if (i < row - 1) {
                    l += board[i + 1][j];
                    if (board[i + 1][j] == 0) {
                        d++;
                    }
                }
                //右
                if (j < col - 1) {
                    l += board[i][j + 1];
                    if (board[i][j + 1] == 0) {
                        d++;
                    }
                }
                //左上
                if (i > 0 && j > 0) {
                    l += board[i - 1][j - 1];
                    if (board[i - 1][j - 1] == 0) {
                        d++;
                    }
                }
                //右上
                if (i > 0 && j < col - 1) {
                    l += board[i - 1][j + 1];
                    if (board[i - 1][j + 1] == 0) {
                        d++;
                    }
                }
                //左下
                if (i < row - 1 && j > 0) {
                    l += board[i + 1][j - 1];
                    if (board[i + 1][j - 1] == 0) {
                        d++;
                    }
                }
                //右下
                if (i < row - 1 && j < col - 1) {
                    l += board[i + 1][j + 1];
                    if (board[i + 1][j + 1] == 0) {
                        d++;
                    }
                }
                if (board[i][j] == 0) {
                    if (l == 3) {
                        tmp[i][j] = 1;
                    }
                    continue;
                } else {
                    if (l == 2 || l == 3)
                        tmp[i][j] = 1;
                }
            }
        }
        board = tmp;
    }
}
