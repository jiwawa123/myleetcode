package com.ji.mutiThread;/*
    user ji
    data 2019/9/25
    time 6:26 PM
*/

import java.util.concurrent.Semaphore;

public class H2O {

    private Semaphore h;
    private Semaphore o;

    public H2O() {
        h = new Semaphore(2);
        o = new Semaphore(0);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        h.acquire(1);
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        o.release(1);


    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        o.acquire(2);
        // releaseOxygen.run() outputs "H". Do not change or remove this line.
        releaseOxygen.run();
        h.release(2);
    }
}
