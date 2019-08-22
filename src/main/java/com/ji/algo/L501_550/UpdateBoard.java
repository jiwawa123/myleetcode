package com.ji.algo.L501_550;/*
    user ji
    data 2019/8/22
    time 7:55 PM
*/

public class UpdateBoard {
    public static void main(String[] args) {
        char[][] tmp = {{'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}};
        int arr[] = {3, 0};
        new UpdateBoard().updateBoard(tmp, arr);

    }

    public char[][] updateBoard(char[][] board, int[] click) {
        int r = board.length;
        int c = board[0].length;
        char[][] tmp = new char[r][c];
        boolean flag[][] = new boolean[r][c];
        int x = click[0];
        int y = click[1];
        help(tmp, flag, board, x, y);
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp[i].length; j++) {
                if (!flag[i][j]) {
                    tmp[i][j] = board[i][j];
                }

            }
        }
        return tmp;
    }

    public void help(char[][] tmp, boolean flag[][], char[][] board, int x, int y) {
        if (x < 0 || y < 0 || x > board.length - 1 || y > board[0].length - 1 || flag[x][y])
            return;
        if(board[x][y]=='M')
        {
            flag[x][y] = true;
            tmp[x][y] = 'X';
            return;
        }
        int count = getCount(board, x, y);
        flag[x][y] = true;
        if (count > 0) {
            tmp[x][y] = (char) (count + '0');
            return;
        } else {
            tmp[x][y] = 'B';
        }
        help(tmp, flag, board, x - 1, y);
        help(tmp, flag, board, x + 1, y);
        help(tmp, flag, board, x, y - 1);
        help(tmp, flag, board, x, y + 1);
        help(tmp, flag, board, x - 1, y - 1);
        help(tmp, flag, board, x - 1, y + 1);
        help(tmp, flag, board, x + 1, y - 1);
        help(tmp, flag, board, x + 1, y + 1);


    }

    public int getCount(char[][] board, int x, int y) {
        if (x == 2 && y == 1) {
            System.out.println(x);
        }
        int count = 0;
        if (x > 0) {
            count += board[x - 1][y] == 'M' ? 1 : 0;
        }
        if (x < board.length - 1) {
            count += board[x + 1][y] == 'M' ? 1 : 0;
        }
        if (y > 0) {
            count += board[x][y - 1] == 'M' ? 1 : 0;
        }
        if (y < board[0].length - 1) {
            count += board[x][y + 1] == 'M' ? 1 : 0;
        }
        if (y > 0 && x > 0) {
            count += board[x - 1][y - 1] == 'M' ? 1 : 0;
        }
        if (y > 0 && x < board.length - 1) {
            count += board[x + 1][y - 1] == 'M' ? 1 : 0;
        }
        if (y < board[0].length - 1 && x < board.length - 1) {
            count += board[x + 1][y + 1] == 'M' ? 1 : 0;
        }
        if (x > 0 && y < board[0].length - 1) {
            count += board[x - 1][y + 1] == 'M' ? 1 : 0;
        }
        return count;
    }

}
