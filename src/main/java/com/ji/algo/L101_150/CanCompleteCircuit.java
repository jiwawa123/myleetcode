package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 4:05 PM
*/

public class CanCompleteCircuit {
    public static void main(String[] args) {
        int arr[] = {5, 8, 2, 8};
        int arr1[] = {2, 5, 6, 6};
        System.out.println(canCompleteCircuit(arr, arr1));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int g = gas[i] - cost[i];
            int tt = i+1;
            if(tt>=gas.length)
                tt = 0;
            while(tt!=i&&g>0){
                g += gas[tt] - cost[tt];
                if(g<0)
                    break;
                tt++;
                if(tt>=gas.length)
                    tt = 0;
            }
            if(tt==i&&g>=0)
                return  i;
        }

        return -1;
    }
}
