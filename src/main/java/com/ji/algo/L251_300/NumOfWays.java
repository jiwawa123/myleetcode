package com.ji.algo.L251_300;/*
    user ji
    data 2019/9/9
    time 4:44 PM
*/

//类似于爬楼梯的思想
public class NumOfWays {
    public int numOfWays(int n,int k){
        if(n == 0 || k == 0) return 0;
        if(n == 1) return k;
        int same = k;
        int diff = k * (k-1);
        for(int i = 2 ; i < n ; i++){
            int lasttemp = same * (k - 1 ) + diff * (k - 1);
            same = diff;
            diff = lasttemp;
        }
        return same + diff;
    }
}
