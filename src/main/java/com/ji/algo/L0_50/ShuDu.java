package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/9
    time 9:13 AM
*/

public class ShuDu {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        //进行行判断
        for (int i = 0; i < board.length; i++) {
            int arr[] = new int[9];
            for (int j = 0; j < board.length; j++) {
                int tmp = board[i][j]-'0'-1;
                if(board[i][j]!='.'){
                    if(arr[tmp]!=0)
                        return false;
                    arr[tmp] = 1;
                }
            }
        }
        //进行列判断
        for (int i = 0; i < board.length; i++) {
            int arr[] = new int[9];
            for (int j = 0; j < board.length; j++) {
                int tmp = board[j][i]-'0'-1;
                if(board[j][i]!='.'){
                    if(arr[tmp]!=0)
                        return false;
                    arr[tmp] = 1;
                }
            }
        }
        //进行每个格子判断
        for (int i = 0; i < board.length; i+=3) {
            for (int j = 0; j < board.length; j+=3) {
                int arr[] = new int[9];
                for (int k = i; k <i+3 ; k++) {
                    for (int l = j; l < j+3; l++) {
                        int tmp = board[k][l]-'0'-1;
                        if(board[k][l]!='.'){
                            if(arr[tmp]!=0)
                                return false;
                            arr[tmp] = 1;
                        }
                    }
                }
            }
        }
        return true;
    }
}
