package com.ji.algo.L51_100;/*
    user ji
    data 2019/6/4
    time 3:06 PM
*/

public class NumTrees {
    public static void main(String[] args) {
        System.out.println(numTrees(2));
    }

    public static int numTrees(int n) {
        int result=0;
        int[] f=new int[n+1];
        f[1]=1;
        f[0]=1;
        int point=2;
        while (point<=n){
            for(int i=1;i<=point;i++)
                f[point]+=f[i-1]*f[point-i];
            point++;
        }
        return f[n];
    }
}
