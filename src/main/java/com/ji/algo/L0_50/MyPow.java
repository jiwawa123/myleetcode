package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/9
    time 9:39 AM
*/

public class MyPow {
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }
    //使用折半搜索
    public static double myPow(double x, int n) {
        double res = 1.0;
        for(int i = n; i != 0; i /= 2){
            if(i % 2 != 0){
                res *= x;
            }
            x *= x;
        }
        return  n < 0 ? 1 / res : res;
    }
}
