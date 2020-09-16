package com.ji.algo.second;

/**
 * user ji
 * data 2020/9/13
 * time 8:47 上午
 */
public class L79 {
    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {
        if (word.equals(""))
            return true;
        if (board == null || board.length == 0)
            return false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (help(board, word, 0, new boolean[board.length][board[0].length], i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean help(char[][] board, String word, int end, boolean flag[][], int row, int col) {
        if (word.length() == end)
            return true;
        if (row >= board.length || row < 0 || col >= board[0].length || col < 0)
            return false;
        if (flag[row][col])
            return false;
        if (board[row][col] != word.charAt(end)) {
            return false;
        }
        flag[row][col] = true;
        if (help(board, word, end + 1, flag, row, col + 1)) {
            return true;
        }
        if (help(board, word, end + 1, flag, row, col - 1)) {
            return true;
        }
        if (help(board, word, end + 1, flag, row + 1, col)) {
            return true;
        }
        if (help(board, word, end + 1, flag, row - 1, col)) {
            return true;
        }
        flag[row][col] = false;
        return false;
    }
}
