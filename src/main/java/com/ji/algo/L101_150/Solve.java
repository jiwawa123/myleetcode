package com.ji.algo.L101_150;/*
    user ji
    data 2019/7/28
    time 10:45 AM
*/

public class Solve {
    //直接从边缘入手即可
    boolean flag[][];

    public void solve(char[][] board) {
        if (null == board || board.length == 0)
            return;
        int row = board.length - 1;
        int col = board[0].length - 1;
        flag = new boolean[board.length][board[0].length];
        for (int i = 0; i <= row; i++) {
            help(board, i, 0);
            help(board, i, col);
        }
        for (int i = 0; i <= col; i++) {
            help(board, 0, i);
            help(board, row, i);
        }

        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < flag[0].length; j++) {
                if (!flag[i][j] && board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }

    public void help(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
            return;
        if (board[i][j] == 'X')
            return;
        flag[i][j] = true;
        help(board, i - 1, j);
        help(board, i + 1, j);
        help(board, i, j - 1);
        help(board, i, j + 1);
    }

    public static void main(String[] args) {
        char arr[][] = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        new Solve().solve(arr);
    }
}
