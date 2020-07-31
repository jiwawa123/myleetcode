package com.ji.pattern.mylock;

import java.util.concurrent.TimeUnit;

/**
 * user ji
 * data 2020/7/31
 * time 10:18 上午
 */
public class Test {
    public static void main(String[] args) {
        AtomicIntegerTest mySpinLock = new AtomicIntegerTest();
        new Thread(() -> {
            mySpinLock.lock();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mySpinLock.unLock();
        }, "A").start();

        new Thread(() -> {
            mySpinLock.lock();
            mySpinLock.unLock();
        }, "B").start();
    }
}
