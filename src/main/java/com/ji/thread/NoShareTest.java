package com.ji.thread;/*
    user ji
    data 2019/5/20
    time 4:28 PM
*/

public class NoShareTest {
    public static void main(String[] args) {
        Thread t1 = new MyNoShareThread("t1");
        Thread t2 = new MyNoShareThread("t2");
        Thread t3 = new MyNoShareThread("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
