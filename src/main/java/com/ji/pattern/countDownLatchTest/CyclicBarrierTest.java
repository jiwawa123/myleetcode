package com.ji.pattern.countDownLatchTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * user ji
 * data 2020/8/2
 * time 9:10 上午
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, () -> {
            System.out.println("=========" + "\t main");
        });
        for (int i = 0; i < 4; i++) {
            new Thread(() -> {
                System.out.println("=======\t" + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
