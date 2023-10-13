package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/10/09:42
 */
public class L79 {

    public static void main(String[] args) {
        L79 l79 = new L79();
        char[][] chars = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        l79.exist(chars,"ABCCED");
    }

    int row;
    int col;

    public boolean exist(char[][] board, String word) {
        if (word.equals("")) {
            return true;
        }
         row = board.length;
         col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(0, word, i, j, board, new boolean[row][col])) {
                        return true;
                    }
                }
            }
        }


        return false;
    }

    public boolean dfs(int len, String word, int r, int c, char[][] board, boolean[][] flag) {
        if (len == word.length()) {
            return true;
        }

        if (r >= row || r < 0 || c < 0 || c >= col || flag[r][c]) {
            return false;
        }

        if (board[r][c] == word.charAt(len)) {
            len++;
            flag[r][c] = true;
        } else {
            return false;
        }
        boolean up = dfs(len, word, r - 1, c, board, flag);
        if (up) {
            return true;
        }
        boolean down = dfs(len, word, r + 1, c, board, flag);
        if (down) {
            return true;
        }

        boolean left = dfs(len, word, r, c - 1, board, flag);
        if (left) {
            return true;
        }

        boolean right = dfs(len, word, r, c + 1, board, flag);
        if (right) {
            return true;
        }


        flag[r][c] = false;
        return false;


    }
}
