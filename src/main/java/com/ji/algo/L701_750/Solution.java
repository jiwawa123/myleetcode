package com.ji.algo.L701_750;/*
    user ji
    data 2019/8/8
    time 9:10 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {
    int[] b;
    int M;
    Random r;
    public Solution(int N, int[] blacklist) {
        b=blacklist;
        Arrays.sort(b);
        M=N-b.length;
        r=new Random();
    }

    public int pick() {
        int a=r.nextInt(M);
        int l=0,r=b.length;
        while(l<r){
            int m=(l+r)/2;
            if(b[m]-1-m>=a){//5 4 0 类似每一个slot最后的数
                r=m;
            }else{
                l=m+1;
            }
        }
        return a+l;
    }

}
