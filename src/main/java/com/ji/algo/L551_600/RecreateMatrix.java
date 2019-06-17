package com.ji.algo.L551_600;/*
    user ji
    data 2019/6/17
    time 11:03 PM
*/

public class RecreateMatrix {
    public static void main(String[] args) {
        int arr[][] ={{1,2},{3,4}};
        matrixReshape(arr,1,4);
    }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums==null||nums.length==0)
            return nums;
        int r1 = nums.length;
        int c1 = nums[0].length;
        if(c1*r1!=r*c)
            return nums;
        int arr[][] = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j= 0;j<c;j++){
                int tr = (i*c+j)/c1;
                int tc = i*c+j - tr*c1;
                arr[i][j] = nums[tr][tc];
            }
        }
        return arr;
    }
}
