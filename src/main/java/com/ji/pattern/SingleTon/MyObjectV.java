package com.ji.pattern.SingleTon;/*
    user ji
    data 2019/9/9
    time 8:49 AM
*/

//使用static 代码块实现单例模式
public class MyObjectV {
    private static MyObjectV instance = null;

    public static void main(String[] args) {


    }

    private MyObjectV() {

    }

    static {
        System.out.println("start ============");
        instance = new MyObjectV();
    }

    public static MyObjectV getInstance() {
        return instance;
    }
}
