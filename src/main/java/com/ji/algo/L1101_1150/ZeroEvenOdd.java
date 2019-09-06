package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/9/6
    time 3:12 PM
*/

public class ZeroEvenOdd {
    private int n;
    private boolean zero;// 打印0
    private boolean eo;// 打印偶数或者奇数

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero() throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < n; i++) {
                while (zero) {
                    this.wait();
                }
                System.out.println(0);
                zero = true;
                this.notifyAll();
            }
        }
    }

    public void odd() throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            synchronized (this) {
                while (!(zero == true && eo == false)) {
                    this.wait();
                }
                System.out.println(i);
                zero = false;
                eo = true;
                this.notifyAll();
            }
        }
    }

    public void even() throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            synchronized (this) {
                while (!(zero == true && eo == true)) {
                    this.wait();
                }
                System.out.println(i);
                zero = false;
                eo = false;
                this.notifyAll();
            }
        }
    }
}
