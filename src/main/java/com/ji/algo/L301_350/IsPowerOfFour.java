package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/24
    time 7:59 PM
*/

public class IsPowerOfFour {
    public static void main(String[] args) {

    }
    public boolean isPowerOfFour(int num) {

            if(num==0)
                return false;
            while(num%4==0){
                num/=4;
            }
            return num==1;

    }
}
