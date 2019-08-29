package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/29
    time 8:09 PM
*/

public class ConsecutiveNumbersSum {
    public static void main(String[] args) {

    }
    public int consecutiveNumbersSum(int N) {
        if(N<=2)
            return 1;
        int c = 0;
        int s;
        for(int i = 1;i<=N;i++){
            s = i*(i+1)/2;
            if(s<N){
                if((N-s)%i==0){
                    c++;
                }

            }
            else if(N==s){
                c+=1;
                break;
            }else{
                break;
            }
        }
        return c;
    }
}
