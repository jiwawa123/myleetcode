package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/9/7
    time 11:46 AM
*/

public class ZeroEvenOddII {
    java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();
    java.util.concurrent.locks.Condition con0 = lock.newCondition();
    java.util.concurrent.locks.Condition con1 = lock.newCondition();
    java.util.concurrent.locks.Condition con2 = lock.newCondition();
    volatile private int next = 0;
    volatile private boolean flag = true;
    private int n;
    public ZeroEvenOddII(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero() throws InterruptedException {
        for(int i= 0;i<n;i++){
            try{
                lock.lock();
                while(next!=0){
                    con0.await();
                }
                System.out.println(0);
                if(flag){
                    flag = false;
                    next = 1;
                    con1.signalAll();

                }else{
                    flag = true;
                    next =2;
                    con2.signalAll();

                }
            }catch(InterruptedException e){

            }finally{
                lock.unlock();
            }
        }

    }

    public void odd() throws InterruptedException {
        for(int i= 1;i<=n;i+=2){
            try{

                lock.lock();
                while(next!=1){
                    con1.await();
                }
                System.out.println(i);
                next = 0;
                con0.signalAll();
            }catch(InterruptedException e){

            }finally{
                lock.unlock();
            }
        }
    }

    public void even() throws InterruptedException {
        for(int i= 2;i<=n;i+=2){
            try{
                lock.lock();
                while(next!=2){
                    con2.await();
                }
                System.out.println(i);
                next = 0;
                con0.signalAll();
            }catch(InterruptedException e){

            }finally{
                lock.unlock();
            }
        }
    }
}
