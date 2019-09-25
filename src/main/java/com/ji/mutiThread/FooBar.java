package com.ji.mutiThread;/*
    user ji
    data 2019/9/25
    time 6:24 PM
*/

import java.util.concurrent.Semaphore;

public class FooBar {
    //使用信号量实现交替打印
    private int n;
    private Semaphore semaphoreFoo = new Semaphore(0);
    private Semaphore semaphoreBar = new Semaphore(1);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreBar.acquire();
            printFoo.run();
            semaphoreFoo.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreFoo.acquire();
            printBar.run();
            semaphoreBar.release();
        }
    }
}
