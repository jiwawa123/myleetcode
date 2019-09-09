package com.ji.pattern.SingleTon;/*
    user ji
    data 2019/9/9
    time 8:36 AM
*/

//懒汉模式，并不能实现线程安全
public class MyObjectII {
    public static void main(String[] args) {

    }

    private MyObjectII() {

    }

    private static MyObjectII myObjectII;

    public static MyObjectII getIntance() {
        if (myObjectII == null) {
            myObjectII = new MyObjectII();
        }
        return myObjectII;
    }
}
