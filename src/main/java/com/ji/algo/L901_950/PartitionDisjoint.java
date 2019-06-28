package com.ji.algo.L901_950;/*
    user ji
    data 2019/6/28
    time 10:03 PM
*/

public class PartitionDisjoint {
    public static void main(String[] args) {
        int arr[] = {32,57,24,19,0,24,49,67,87,87};
        System.out.println(partitionDisjoint(arr));
    }
    public static int partitionDisjoint(int[] A) {
        if(A==null||A.length==0)
            return 0;
        int left = 1;
        int i = 0;
        int max = A[i];
        while(i<A.length){
            if(max<=A[i]){
                i++;
            }else{
                left = i+1;
                i++;
            }
        }
        return left;
    }
}
