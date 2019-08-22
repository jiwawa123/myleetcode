package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/8/22
    time 10:22 AM
*/

public class BaseNeg2 {
    public static void main(String[] args) {
        System.out.println(2/(-2));

    }

    public String baseNeg2(int N) {
        if(N == 0)
            return "0";
        String result = "";
        int n = N;
        while(n != 0){
            if(n % 2 == 0){
                result = "0" + result;
                n = n / (-2);
            }else {
                result = "1" + result;
                n = (n - 1) / (-2);
            }
        }
        return result;
    }
}
