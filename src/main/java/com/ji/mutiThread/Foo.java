package com.ji.mutiThread;/*
    user ji
    data 2019/9/25
    time 6:09 PM
*/

import java.util.concurrent.Semaphore;

public class Foo {
    private Semaphore one;
    private Semaphore two;
    private Semaphore three;
    //使用信号量实现对于多线程的控制
    int m;

    public Foo() {
        m = 1;
        one = new Semaphore(1);
        two = new Semaphore(0);
        three = new Semaphore(0);
    }


    public void first(Runnable printFirst) throws InterruptedException {
        one.acquire();
        while (m != 1) {

        }
        m++;
        printFirst.run();
        two.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        two.acquire();
        while (m != 2) {
        }
        m++;
        printSecond.run();
        three.release();
    }

    public void third(Runnable printFirst) throws InterruptedException {
        three.acquire();
        while (m != 3) {
        }
        m++;
        printFirst.run();
        one.release();
    }
}
