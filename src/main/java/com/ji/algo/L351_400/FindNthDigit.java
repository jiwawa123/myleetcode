package com.ji.algo.L351_400;/*
    user ji
    data 2019/5/3
    time 9:09 AM
*/

public class FindNthDigit {
    public static void main(String[] args) {

    }


    public int findNthDigit(int n) {
        int i=0;
        int res=0;
        int temp=n;
        while(temp > 9*Math.pow(10,i)*(i+1)){
            temp -= 9*Math.pow(10,i)*(i+1);
            i++;
        }
        for(int j=0;j<i;j++){
            res += 9*Math.pow(10,j);
        }
        res += temp/(i+1);
        if(temp%(i+1)==0)
            return Integer.parseInt((res+"").charAt(i)+"");
        else
            return Integer.parseInt(((res+1)+"").charAt(temp%(i+1)-1)+"");
    }
}
