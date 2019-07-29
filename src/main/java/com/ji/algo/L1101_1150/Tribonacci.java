package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/29
    time 11:22 AM
*/

public class Tribonacci {
    public static void main(String[] args) {

    }
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n<=2)
            return 1;
        int tmp = 3;
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        while(tmp<=n){
            int next = f1+f2+f3;
            f1 = f2;
            f2 =f3;
            f3 = next;
            tmp++;
        }
        return f3;

    }
}
