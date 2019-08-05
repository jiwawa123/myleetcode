package com.ji.algo.L151_200;/*
    user ji
    data 2019/8/5
    time 2:24 PM
*/

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(13));
    }

    public static int reverseBits(int n) {
        int a=0;
        for(int i=0;i<=31;i++){
            a=a+((1&(n>>i))<<(31-i));
        }
        return a;
    }
}
