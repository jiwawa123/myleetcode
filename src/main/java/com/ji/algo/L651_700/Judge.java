package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/4
    time 9:53 PM
*/

public class Judge {
    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {
        int u = 0;
        int l = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    u++;
                    break;
                case 'D':
                    u--;
                    break;
                case 'L':
                    l++;
                    break;
                default:
                    l--;
                    break;
            }
        }
        return u == 0 && l == 0;
    }
}
