package com.ji.pattern.mylock;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * user ji
 * data 2020/7/31
 * time 1:41 下午
 */
public class AtomicIntegerTest {
    AtomicInteger atomicInteger = new AtomicInteger(0);

    public void lock() {
        System.out.println(Thread.currentThread().getName() + " is ready to get the lock");
        while (!atomicInteger.compareAndSet(0, 1)) {
            System.out.println(Thread.currentThread().getName() + " is try to get the lock");
        }
        System.out.println(Thread.currentThread().getName() + " get the lock");
    }

    public void unLock() {
        if (atomicInteger.compareAndSet(1, 0)) {
            System.out.println(Thread.currentThread().getName() + "  release the lock");
        }
    }

}
