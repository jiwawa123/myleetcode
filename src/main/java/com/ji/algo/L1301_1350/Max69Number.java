package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/30
    time 10:29 AM
*/

public class Max69Number {
    public static void main(String[] args) {

    }
    public int maximum69Number (int num) {
        String tmp = num+"";
        String res = "";
        for (int i = 0; i < tmp.length(); i++) {
            if(tmp.charAt(i)=='6'){
                res = tmp.substring(0,i)+'9'+tmp.substring(i,tmp.length());
                return Integer.valueOf(res);
            }
        }
        return num;
    }
}
