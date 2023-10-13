package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/07/19:33
 */
public class L130 {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] flag = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            if (i == row - 1 || i == 0) {
                for (int j = 0; j < col; j++) {
                    dfs(i, j, board, flag);
                }
            } else {
                dfs(i, 0, board, flag);
                dfs(i, col - 1, board, flag);
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!flag[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(int x, int y, char[][] board, boolean[][] flag) {
        if (x < 0 || x > board.length || y < 0 || y > board[0].length) {
            return;
        }
        if (flag[x][y] || board[x][y] == 'X') {
            return;
        }

        flag[x][y] = true;
        dfs(x + 1, y, board, flag);
        dfs(x - 1, y, board, flag);
        dfs(x, y - 1, board, flag);
        dfs(x, y + 1, board, flag);

    }
}
