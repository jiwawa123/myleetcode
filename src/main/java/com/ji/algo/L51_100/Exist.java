package com.ji.algo.L51_100;/*
    user ji
    data 2019/7/24
    time 10:04 AM
*/

public class Exist {
    public static void main(String[] args) {
        char[][] board =
                {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(new Exist().exist(board, "ABCESEEEFS"));
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                boolean flag[][] = new boolean[board.length][board[i].length];
                if (help(board, word, 0, i, j, flag))
                    return true;
            }
        }
        return false;
    }

    public boolean help(char[][] board, String word, int index, int i, int j, boolean flag[][]) {
        boolean flag1[][] = new boolean[board.length][board[0].length];
        for (int k = 0; k < flag.length; k++) {
            for (int l = 0; l < flag[k].length; l++) {
                flag1[k][l] = flag[k][l];
            }
        }
        if (index == word.length())
            return true;
        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1)
            return false;
        if (flag[i][j] || board[i][j] != word.charAt(index))
            return false;
        flag1[i][j] = true;
        return help(board, word, index + 1, i - 1, j, flag1) || help(board, word, index + 1, i + 1, j, flag1)
                || help(board, word, index + 1, i, j + 1, flag1) || help(board, word, index + 1, i, j - 1, flag1);
    }
}
