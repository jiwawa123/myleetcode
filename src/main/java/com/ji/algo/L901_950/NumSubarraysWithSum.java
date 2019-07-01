package com.ji.algo.L901_950;/*
    user ji
    data 2019/7/1
    time 10:41 AM
*/

public class NumSubarraysWithSum {
    public static void main(String[] args) {

    }
    public int numSubarraysWithSum(int[] A, int S) {
        int count = 0;
        for(int i = 0;i<A.length;i++){
            int sum = A[i];
            if(sum>S)
                continue;
            if(sum==S)
                count++;
            for(int j=i+1;j<A.length;j++){
                sum+=A[j];
                if(sum>S)
                    break;
                if(sum==S)
                    count++;
            }
        }
        return count;
    }
}
