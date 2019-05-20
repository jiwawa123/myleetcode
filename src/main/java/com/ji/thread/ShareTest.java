package com.ji.thread;/*
    user ji
    data 2019/5/20
    time 4:34 PM
*/

public class ShareTest {
    //使用thread 构造器，将总的线程的对象传入其中；
    public static void main(String[] args) {
        Thread all = new MyShareThread("all");
        Thread t1 = new Thread(all, "t1");
        Thread t2 = new Thread(all, "t2");
        Thread t3 = new Thread(all, "t3");
        Thread t4 = new Thread(all, "t4");
        Thread t5 = new Thread(all, "t5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
