package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/9/25
    time 6:02 PM
*/

import java.util.concurrent.Semaphore;

public class FizzBuzz {
    private int n;
    private int m;
    private Semaphore number;
    private Semaphore fizz;
    private Semaphore buzz;
    private Semaphore fizzBuzz;

    public FizzBuzz(int n) {
        this.n = n;
        m = 1;
        number = new Semaphore(1);
        fizz = new Semaphore(0);
        buzz = new Semaphore(0);
        fizzBuzz = new Semaphore(0);
    }

    public void fizz(Runnable printFizz) throws InterruptedException {
        while (m <= n) {
            fizz.acquire();
            if (m > n) break;
            printFizz.run();
            m++;
            number.release();
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (m <= n) {
            buzz.acquire();
            if (m > n) break;
            printBuzz.run();
            m++;
            number.release();
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (m <= n) {
            fizzBuzz.acquire();
            if (m > n) break;
            printFizzBuzz.run();
            m++;
            number.release();
        }
    }

    public void number() throws InterruptedException {
        while (m <= n) {
            number.acquire();
            if (m % 15 == 0) {
                fizzBuzz.release();
            } else if (m % 3 == 0) {
                fizz.release();
            } else if (m % 5 == 0) {
                buzz.release();
            } else {
                System.out.println(m);
                m++;
                number.release();
            }
        }
        fizz.release();
        buzz.release();
        fizzBuzz.release();
    }
}
