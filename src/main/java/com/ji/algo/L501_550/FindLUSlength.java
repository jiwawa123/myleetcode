package com.ji.algo.L501_550;/*
    user ji
    data 2019/6/18
    time 9:26 AM
*/

public class FindLUSlength {
    public static void main(String[] args) {

    }
    public int findLUSlength(String a, String b) {
        if(a==null&&b==null)
            return -1;
        if(a==null)
            return b.length();
        if(b==null)
            return a.length();
        if(a.equals(b))
            return -1;
        return Math.max(a.length(),b.length());
    }
}
