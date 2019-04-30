package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/4/30
    time 8:40 PM
*/

public class CanThreePartsEqualSum {
    public static void main(String[] args) {

    }
    public boolean canThreePartsEqualSum(int[] A) {
        if(null==A||A.length<3)
            return false;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0)
            return false;
        int avarge = sum / 3;
        int i = 0, j = A.length - 1;
        int sum1 = 0;
        int sum2 = 0;
        while (i < j) {
            if (sum1 == avarge && sum2 == avarge&&j-i>=2) {
                return true;
            } else if (sum1 != avarge) {
                sum1 += A[i];
                if(sum1 != avarge){
                    i++;
                }
            } else if (sum2 != avarge) {
                sum2 += A[j];
                if(sum2 != avarge){
                    j--;
                }
            }
        }
        return false;
    }
}
