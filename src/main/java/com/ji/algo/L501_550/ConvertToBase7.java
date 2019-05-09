package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/9
    time 5:11 PM
*/

public class ConvertToBase7 {
    public static void main(String[] args) {

    }

    public String convertToBase7(int num) {
        if(num==0)
            return "0";
        int tmp = Math.abs(num);
        StringBuffer sp = new StringBuffer();
        while (tmp > 0) {
            sp.append(tmp % 7);
            tmp /= 7;
        }
        return num>=0?sp.reverse().toString():"-"+sp.reverse().toString();
    }
}
