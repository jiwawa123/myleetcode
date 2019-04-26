package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/26
    time 10:28 AM
*/

import java.util.Stack;

public class IsValidSerialization {
    public static void main(String[] args) {
        System.out.println(isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }

    public static boolean isValidSerialization(String preorder) {
        String[]temp = preorder.split(",");
        if(temp[0].equals("#")&&temp.length==1) return true;
        //考虑一开始就是使用#开头，字符串个数为偶数
        if(temp[0].equals("#")||temp.length%2==0) return false;
        int count = 1;
        for(int i =0;i<temp.length;i++)
        {
            count--;
            if(count<0) return false;
            if(!temp[i].equals("#"))
                count+=2;
        }
        return count == 0;
    }
}
