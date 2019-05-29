package com.ji.new_algo;/*
    user ji
    data 2019/5/29
    time 10:50 AM
*/

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String str = "abc";
        char[] array = {'a', 'b', 'c'};
        String str2 = new String(array);
        //使用intern()将str2字符串内容放入常量池
        str2 = str2.intern();
        //这个比较用来说明字符串字面常量和我们使用intern处理后的字符串是在同一个地方
        System.out.println(str == str2);
        //那好，下面我们就拼命的intern吧
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 50000000; i++) {
            String temp = String.valueOf(i).intern();
            list.add(temp);
        }
    }
}
