package com.ji.new_algo;/*
    user ji
    data 2019/5/29
    time 10:50 AM
*/

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        try{
            int i = 100 / 0;
            System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
            throw new RuntimeException();
        }finally{
            System.out.print(2);
        }
        System.out.print(3);
    }
}
