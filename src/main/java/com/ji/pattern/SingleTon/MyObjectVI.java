package com.ji.pattern.SingleTon;/*
    user ji
    data 2019/9/9
    time 8:54 AM
*/

//使用volatile实现的强制刷新线程
public class MyObjectVI {
    public static void main(String[] args) {

    }

    private volatile static MyObjectVI instance;

    private MyObjectVI() {
    }

    public static MyObjectVI getInstance() {
        if (instance == null) {
            synchronized (MyObjectVI.class) {
                if (instance == null) {
                    instance = new MyObjectVI();
                }
            }
        }
        return instance;
    }
}
