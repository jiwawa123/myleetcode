package com.ji.pattern.countDownLatchTest;

import java.util.concurrent.CountDownLatch;

/**
 * user ji
 * data 2020/8/2
 * time 8:59 上午
 */
public class TestDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch downLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                        System.out.println("=======\t" + Thread.currentThread().getName());
                        downLatch.countDown();
                    }
            ).start();
        }
        downLatch.await();
        System.out.println("=========\t" + "is over");
    }
}
