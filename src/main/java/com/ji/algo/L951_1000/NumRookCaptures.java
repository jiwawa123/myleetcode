package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/21
    time 2:25 PM
*/

public class NumRookCaptures {
    public static void main(String[] args) {

    }

    public int numRookCaptures(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    for (int k = j - 1; k >= 0; k--) {
                        if (board[i][k] == 'B') {
                            break;
                        }
                        if (board[i][k] == 'P')
                            count++;
                    }
                    for (int k = j + 1; k <= board[i].length; k++) {
                        if (board[i][k] == 'B') {
                            break;
                        }
                        if (board[i][k] == 'P')
                            count++;
                    }
                    for (int k = i - 1; k >= 0; k--) {
                        if (board[k][j] == 'B') {
                            break;
                        }
                        if (board[k][j] == 'P')
                            count++;
                    }
                    for (int k = i + 1; k < board.length; k++) {
                        if (board[k][j] == 'B') {
                            break;
                        }
                        if (board[k][j] == 'P')
                            count++;
                    }
                }
            }
        }
        return count;
    }
}
