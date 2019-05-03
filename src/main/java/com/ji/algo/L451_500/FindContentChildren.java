package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/3
    time 8:46 PM
*/

import java.util.Arrays;

public class FindContentChildren {
    public static void main(String[] args) {

    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0 , j = 0;
        int count = 0;
        while(i<g.length&&j<s.length){
            if(g[i]<=s[j]){
                i++;
                j++;
                count++;
            }else{
                j++;
            }
        }
        return count;
    }
}
