package com.ji.algo.L151_200;/*
    user ji
    data 2019/9/3
    time 5:59 PM
*/

public class ReverseII {
    public static void main(String[] args) {

    }

    public String reverse(String word) {
        String tmp[] = word.trim().split(" ");
        StringBuilder sp = new StringBuilder();
        for (int i = tmp.length - 1; i >= 0; i--) {
            sp.append(tmp[i] + " ");
        }
        return sp.toString().trim();
    }
}
