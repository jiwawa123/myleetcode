package com.ji.thread;/*
    user ji
    data 2019/5/20
    time 4:33 PM
*/

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MyShareThread extends Thread {
    private static AtomicInteger count = new AtomicInteger(1000);
    private static Random random = new Random(System.currentTimeMillis());

    public MyShareThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public synchronized void run() {
        super.run();
        try {
            while (count.get() > 0) {
                this.notifyAll();
                System.out.println(Thread.currentThread().getName() + " is doing  " + count.get());
                count.getAndSet(count.get() - 1);
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
