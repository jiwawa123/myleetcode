package com.ji.thread;/*
    user ji
    data 2019/5/8
    time 8:25 PM
*/

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CustomTask implements Runnable {
    private int id;
    private List<Integer> list;
    private int sum;

    public CustomTask(int id, List<Integer> list) {
        this.id = id;
        this.list = list;
    }


    @Override
    public void run() {
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(Thread.currentThread().getName()+" "+sum);
    }

    public int getSum() {
        return sum;
    }
}