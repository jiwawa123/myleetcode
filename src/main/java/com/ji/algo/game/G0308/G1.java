package com.ji.algo.game.G0308;/*
    user ji
    data 2020/3/8
    time 10:28 AM
*/

public class G1 {
    public static void main(String[] args) {

    }

    public String generateTheString(int n) {
        StringBuilder sp = new StringBuilder();
        int i = 0;
        while (i < n - 1) {
            sp.append('a');
        }
        if (n % 2 == 0) {
            sp.append('b');
        }else{
            sp.append('a');
        }
        return sp.toString();
    }
}
