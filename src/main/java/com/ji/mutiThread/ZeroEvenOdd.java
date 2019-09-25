package com.ji.mutiThread;/*
    user ji
    data 2019/9/25
    time 6:39 PM
*/

import java.util.concurrent.Semaphore;

public class ZeroEvenOdd {
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    private int num = 0;
    private boolean flag = true;
    private Semaphore zero = new Semaphore(1);
    private Semaphore one = new Semaphore(0);
    private Semaphore two = new Semaphore(0);

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            zero.acquire();

            if (flag) {
                one.release();
                flag = false;
            } else {
                two.release();
                flag = true;
            }
        }
    }

    public void even() throws InterruptedException {
        for (int i = 1; i < n; i += 2) {
            one.acquire();

            zero.release();
        }
    }

    public void odd() throws InterruptedException {
        for (int i = 1; i < n; i += 2) {
            two.acquire();

            zero.release();
        }
    }
}
