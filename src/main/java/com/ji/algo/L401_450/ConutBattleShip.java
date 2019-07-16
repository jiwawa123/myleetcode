package com.ji.algo.L401_450;/*
    user ji
    data 2019/7/16
    time 7:45 PM
*/

public class ConutBattleShip {
    public static void main(String[] args) {

    }

    public int countBattleships(char[][] board) {
        int count = 0;
        for(int i = 0 ; i < board.length ; i ++) {
            for(int j = 0 ; j < board[0].length ; j ++) {
                if(board[i][j] == 'X') {
                    Boolean isShip = true;
                    if(i != 0) {
                        if(board[i - 1][j] == 'X') {
                            isShip = false;
                        }
                    }
                    if(j != 0) {
                        if(board[i][j - 1] == 'X') {
                            isShip = false;
                        }
                    }
                    if(isShip) {
                        count ++;
                    }
                }
            }
        }
        return count;
    }
}
