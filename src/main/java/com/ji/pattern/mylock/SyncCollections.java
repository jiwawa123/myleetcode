package com.ji.pattern.mylock;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * user ji
 * data 2020/8/1
 * time 8:16 上午
 */
public class SyncCollections {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new Vector<>();
        Collections.synchronizedList(list);


        Lock lock = new ReentrantLock();
        Collections.synchronizedSet(new HashSet<>());
        long a = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    list.add("xxxx");
                }
            }, "xxx" + i).start();
        }

        Thread.sleep(5L);
        System.out.println(list.size());
    }
}
