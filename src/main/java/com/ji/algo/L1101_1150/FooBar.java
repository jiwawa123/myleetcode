package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/17
    time 9:48 AM
*/

import java.util.concurrent.Semaphore;
class FooBar {
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