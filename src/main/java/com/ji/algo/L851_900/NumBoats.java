package com.ji.algo.L851_900;/*
    user ji
    data 2019/6/29
    time 4:17 PM
*/

import java.util.Arrays;

public class NumBoats {
    public static void main(String[] args) {

    }
    //有点类似与贪心算法的模样
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int count = 0;
        while(j>=i){
            if(people[j]>=limit){
                count++;
                j--;
                continue;
            }
            if(people[j]+people[i]<=limit){
                j--;i++;count++;
            }else{
                count++;
                j--;
            }
        }
        return count;
    }
}
