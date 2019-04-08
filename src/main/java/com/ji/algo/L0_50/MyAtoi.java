package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/4
    time 8:55 AM
*/

public class MyAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi(" -42"));
    }
    // 这个问题比较坑，主要是考虑比较多的情况，在我第三次刷的时候，都感觉比较难考虑全面
    // 尤其是很多数学的东西自己都没有考虑到
    public static int myAtoi(String str) {
        str = str.trim();//过滤前面的空格
        int flag = 1;
        boolean first = false;
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='+'&&str.charAt(i)!='-'&&(str.charAt(i)<'0'||str.charAt(i)>'9'))
                break;
            if(str.charAt(i)=='+'||str.charAt(i)=='-'){
                if(first)
                    break;
                else{
                    first = true;
                    if(str.charAt(i)=='-')
                        flag = -1;
                }
                continue;
            }
            if(i==0){
                first = true;
            }
            if(sp.length()>0||str.charAt(i)!='0')
                sp.append(str.charAt(i));
            if(sp.length()>10)
                break;
        }
        if(sp.length()==0)
            return 0;
        long tmp = Long.valueOf(sp.toString())*flag;
        if(tmp<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if(tmp>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)tmp;
    }

}
