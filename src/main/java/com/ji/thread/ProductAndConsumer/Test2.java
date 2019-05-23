package com.ji.thread.ProductAndConsumer;/*
    user ji
    data 2019/5/22
    time 11:55 AM
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            int temp=i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(200);
                        System.out.println("threadName:"+Thread.currentThread().getName()+",i："+temp);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        
    }
}
