package com.ji.algo.L751_800;/*
    user ji
    data 2019/7/24
    time 9:35 AM
*/

import java.util.HashMap;
import java.util.Map;

public class NumRabbits {
    public static void main(String[] args) {
        int arr[] = {0, 2, 0, 2, 1};
    }

    public static int numRabbits(int[] answers) {
        int total = 0;
        int[] statics = new int[1000];
        for(int answer : answers){
            statics[answer]++;
        }
        for(int i=0; i<statics.length; i++){
            if(statics[i] == 0){
                continue;
            }
            if(statics[i]%(i+1) == 0){
                total += (statics[i]/(i+1))*(i+1);
            }else{
                total += (statics[i]/(i+1) + 1)*(i+1);
            }
        }
        return total;
    }
}
