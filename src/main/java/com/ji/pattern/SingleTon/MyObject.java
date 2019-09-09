package com.ji.pattern.SingleTon;/*
    user ji
    data 2019/9/9
    time 8:33 AM
*/

//饿汉模式，可以保证多线程安全
public class MyObject {
    public static void main(String[] args) {

    }

    private MyObject() {

    }

    private static MyObject myObject = new MyObject();

    public static MyObject getIntance() {
        return myObject;
    }
}
