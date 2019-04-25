package com.ji.algo.L351_400;/*
    user ji
    data 2019/4/25
    time 11:03 PM
*/

public class IsPower {
    public static void main(String[] args) {
        System.out.println(isPerfectSquareII(2147483647));
    }

    public boolean isPerfectSquare(int num) {
        int seed = 1;
        while (num > 0) {
            num -= seed;
            seed += 2;
        }
        return num == 0;
    }

    public static boolean isPerfectSquareII(int num) {
        if(num == 0 || num == 1){
            return true;
        }
        if(num < 0){
            return false;
        }
        //二分找到平方比num小的
        int start = 0;
        int end = num;
        while(start <= end){
            int mid = start + (end - start) / 2;
            //可能溢出
            //int pow = mid * mid;
            if(mid == num *1.0 / mid){
                return true;
            }
            else if(mid < num * 1.0 / mid){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
