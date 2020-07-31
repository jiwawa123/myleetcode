package com.ji.pattern.mylock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * user ji
 * data 2020/7/31
 * time 10:18 上午
 */
public class MySpinLock {
    AtomicReference<Thread> reference = new AtomicReference<>();
    public void lock(){
        System.out.println(Thread.currentThread().getName()+"  want to get lock");
        while (!reference.compareAndSet(null,Thread.currentThread())){
            System.out.println(Thread.currentThread().getName()+"  try to get Lock");
        }
        System.out.println(Thread.currentThread().getName()+"  got the lock");
    }
    public void unLock(){
        System.out.println(Thread.currentThread().getName()+"  want to  Unlock");
        reference.compareAndSet(Thread.currentThread(),null);
        System.out.println(Thread.currentThread().getName()+"  Unlock ");
    }


}
