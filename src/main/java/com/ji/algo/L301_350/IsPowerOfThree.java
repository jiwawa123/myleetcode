package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/24
    time 9:14 PM
*/

public class IsPowerOfThree {
    public static void main(String[] args) {

    }
    public boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}
