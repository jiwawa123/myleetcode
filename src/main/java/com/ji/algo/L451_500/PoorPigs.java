package com.ji.algo.L451_500;/*
    user ji
    data 2019/8/15
    time 2:58 PM
*/

public class PoorPigs {
    public static void main(String[] args) {

    }
    //毒药问题
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if(buckets<2)
            return 0;
        int k =  minutesToTest/minutesToDie+1;
        int tmp = k;
        int count = 1;
        while(tmp<buckets){
            count++;
            tmp*=k;
        }
        return count;
    }
}
