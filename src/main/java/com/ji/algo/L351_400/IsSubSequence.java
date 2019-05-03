package com.ji.algo.L351_400;/*
    user ji
    data 2019/5/3
    time 7:50 PM
*/

public class IsSubSequence {
    public static void main(String[] args) {

    }
    public boolean isSubSequence(String s,String t){
        if(s==null&&t==null)
            return true;
        if(s.equals(""))
            return true;
        if(s.length()<t.length())
            return false;
        int i = 0;
        while(i<s.length()){
            int index = t.indexOf(s.charAt(i));
            if(index==-1)
                return false;
            t = t.substring(index+1,t.length());
            i++;
        }
        return true;
    }
}
