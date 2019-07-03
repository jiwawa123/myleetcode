package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/7/3
    time 10:44 PM
*/

public class QueryString {
    public static void main(String[] args) {

    }

    public boolean queryString(String S, int N) {
        for (int i = 1; i <= N; i++) {
            String tmp = Integer.toBinaryString(i);
            if (S.indexOf(tmp) == -1)
                return false;
        }
        return true;
    }
}
